package example;

/**
 *
 * @author seunghyekim
 */
public class check {
    
  public static void main(String[] args) {
    boolean flag = checkPalindrome("sitonapanotis");
    System.out.println(flag);
    flag = checkPalindrome("nine");
    System.out.println(flag);
    flag = checkPalindrome("amanaplanacanalpanama");
    System.out.println(flag);

  }

  /* Recursive Java example to check for palindromes */
  public static boolean checkPalindrome(String s) {
    if (s.length() == 0 || s.length() == 1) {
      return true;
    }
    if (s.charAt(0) == s.charAt(s.length() - 1)) {
      return checkPalindrome(s.substring(1, s.length() - 1));
    }
    return false;
  }
}
