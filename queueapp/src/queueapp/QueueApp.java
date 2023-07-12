package queueapp;

/* @author seunghyekim */
public class QueueApp {
    public static void main(String[] args) {
      
        QueueInterface q = new MyQueue();
        q.enqueue("Element 1");
        q.enqueue("Element 2");
        q.enqueue("Element 3");
        System.out.prinln("Add three elements");
        
        System.out.println("size is "+q.size());
        
        q.enqueue("Element 4");
        q.enqueue("Element 5");
        q.enqueue("Element 6");
        q.enqueue("Element 7");
        q.enqueue("Element 8");
        q.enqueue("Element 9");
        q.enqueue("Element 10");
        System.out.println("Added seven more elements");
        
        System.out.println("size is "+ q.size());
        
        System.out.println(q.frontElement() + " is at the Front");
        
        while (q.size() > 0){
            System.out.println("dequeued: " + q.dequeue());
            System.out.println("size is " + q.size());
        }
        
        System.out.println("size is empty? " + q.size());
        System.out.println("dequeued: " + q.dequede());
        
        System.out.println("size is   empty? " + q.size());
        
    }
}
