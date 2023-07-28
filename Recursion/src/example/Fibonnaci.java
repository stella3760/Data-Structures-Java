package example;

/**
 *
 * @author seunghyekim
 */
public class Fibonnaci {
    
  public static void main (String args[]) {
    for(long i=1; i<=9; i++){ 
      System.out.print(fibonacci(i) +" "); 
    }
    System.out.println();
  }


  /* A recursive Fibonnaci sequence in Java program */
  public static long fibonacci(long number) {
    if (number == 1 || number == 2) {
      return 1;
    }
    return fibonacci(number - 1) + fibonacci(number - 2);
  }
}

/*
public class Recursion {
    
    static int convertBinaryToDecimal(int binary, int power){
        // base case
        if(binary == 0){
            return 0;
        } else {
            // separate the last digit and convert it to decimal
            int lastDigit = binary % 10;
            return (int)(lastDigit * Math.pow(2, power) + convertBinaryToDecimal(binary/10, power + 1));
        }
    }
    
    public static void main(String[] args) {
        int binaryNumber = 1010;
        int decimalNumber = convertBinaryToDecimal(binaryNumber, 0);
        System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalNumber);
    }
}

*/

/*
public class Main {
    // Recursive method to convert binary to decimal
    public static int binaryToDecimal(String binary, int n) {
        // Base case
        if (n == 0)
            return 0;
        // Recursively call the function to shift the digits and
        // add the last digit after multiplying it by the base
        return binaryToDecimal(binary, n - 1) * 2 + (binary.charAt(n - 1) - '0');
    }

    public static void main(String[] args) {
        String binaryNumber = "1010";
        int decimalNumber = binaryToDecimal(binaryNumber, binaryNumber.length());
        System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalNumber);
    }
}
*/

/*
public class BinaryToDecimal {

  public static void main(String[] args) {
    int binaryNumber = 1111;
    int decimalNumber = binaryToDecimal(binaryNumber);
    System.out.println("The decimal equivalent of " + binaryNumber + " is " + decimalNumber);
  }

  public static int binaryToDecimal(int binary) {
    return binaryToDecimal(binary, 0);
  }

  private static int binaryToDecimal(int binary, int power) {
    if (binary == 0) {
      return 0;
    } else {
      int lastDigit = binary % 10;
      return (int) (lastDigit * Math.pow(2, power) + binaryToDecimal(binary / 10, power + 1));
    }
  }
}

*/