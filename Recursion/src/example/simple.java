
package example;

/**
 *
 * @author seunghyekim
 */

public class simple {
    
  public static void main(String[] args) {
    callMyself(9);
  }
  /* The recursive Java method */
  public static void callMyself(long i) {
    if (i < 0) {
      return;
    }
    System.out.println("Value of i " + i);
    i = i - 1;
    callMyself(i);
  }
}