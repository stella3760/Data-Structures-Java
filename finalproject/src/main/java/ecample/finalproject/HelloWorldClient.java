package ecample.finalproject;

import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Client code based on the helloWorld App
 * https://raw.githubusercontent.com/grpc/grpc-java/master/examples/src/main/java/io/grpc/examples/helloworld/HelloWorldClient.java
 */
public class HelloWorldClient {
	  private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());
	  private final MyService1Grpc.MyService1BlockingStub blockingStubMyService1;
	  private final MyService2Grpc.MyService2BlockingStub blockingStubMyService2;
	  private final MyService3Grpc.MyService3BlockingStub blockingStubMyService3;

	  /** Construct client for accessing HelloWorld server using the existing channel. */
	  public HelloWorldClient(Channel channel) {
	    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
	    // shut it down.

	    // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
	    blockingStubMyService1 = MyService1Grpc.newBlockingStub(channel);
	    blockingStubMyService2 = MyService2Grpc.newBlockingStub(channel);
	    blockingStubMyService3 = MyService3Grpc.newBlockingStub(channel);
	  }

	  /** Say hello to server. */
	  public void runServices(String name) {
		  logger.info("gRPC client with multiple services");
		  MsgRequest request;
		  MsgReply   response;

		  // Run Service1
		  try {
			  request = MsgRequest.newBuilder().setMessage("(Client said: Hiya)").build();
			  response = blockingStubMyService1
					  .withDeadlineAfter(500, TimeUnit.MILLISECONDS)
					  .function1Service1(request);
			  logger.info("Client Received: " + response.getMessage());
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return;
		  }

		  // Run Service2 function1Service2
		  try {
			  request = MsgRequest.newBuilder().setMessage("(Client said: How're you keeping?)").build();
			  response = blockingStubMyService2
					  .withDeadlineAfter(500, TimeUnit.MILLISECONDS)
					  .function1Service2(request);
			  logger.info("Received: " + response.getMessage());
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return;
		  }

		  // Run Service2 function2Service2
		  try {
			  request = MsgRequest.newBuilder().setMessage("(Client said: What's the craic?)").build();
			  response = blockingStubMyService2
					  .withDeadlineAfter(500, TimeUnit.MILLISECONDS)
					  .function2Service2(request);
			  logger.info("Received: " + response.getMessage());
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return;
		  }
		  
		  // Run Service3
		  try {
			  request = MsgRequest.newBuilder().setMessage("(Client said: How's gone?)").build();
			  response = blockingStubMyService3
					  .withDeadlineAfter(500, TimeUnit.MILLISECONDS)
					  .function1Service3(request);
			  logger.info("Received: " + response.getMessage());
		  } catch (StatusRuntimeException e) {
			  logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
			  return;
		  }
	  }

	  /**
	   * Greet server. If provided, the first element of {@code args} is the name to use in the
	   * greeting. The second argument is the target server.
	   */
	  public static void main(String[] args) throws Exception {
		  String user = "world";
		  String target = "localhost:50051";	// Access a service running on the local machine on port 50051

		  // Create a communication channel to the server, known as a Channel. Channels are thread-safe
		  // and reusable. It is common to create channels at the beginning of your application and reuse
		  // them until the application shuts down.
		  //
		  // For the example we use plaintext insecure credentials to avoid needing TLS certificates. To
		  // use TLS, use TlsChannelCredentials instead.
		  ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
				  .build();
		  try {
			  HelloWorldClient client = new HelloWorldClient(channel);
			  client.runServices(user);
		  } finally {
			  // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
			  // resources the channel should be shut down when it will no longer be used. If it may be used
			  // again leave it running.
			  channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
		  }
	  }
}