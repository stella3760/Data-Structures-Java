package example;

/**
 *
 * @author seunghyekim
 */
public class factorial {
    
  public static void main(String args[]) {
    long nFactoriral = javaFactorial(5);
    System.out.println(nFactoriral);
  }

  /* Java factorial program with recursion. */
  public static long javaFactorial(long n) {
    if (n <= 1) {
      return 1;
    } else {
      return n * javaFactorial(n - 1);
    }
  }
}