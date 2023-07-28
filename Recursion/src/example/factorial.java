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

/*
import java.util.Scanner;

public class Hw_1 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter decimal integer : ");
    int input = scan.nextInt();
    convert(input);
    System.out.println();
    System.out.print("Enter binary integer : ");
    String binInput = scan.next();
    System.out.println(binaryToDecimal(binInput));
  }

  public static void convert(int num) {
    if (num>0) {
      convert(num/2);
      System.out.print(num%2 + " ");
    }
  }

  public static int binaryToDecimal(String binInput){  
    int len = binInput.length();
    if (len == 0) return 0;
    String now = binInput.substring(0,1);
    String later = binInput.substring(1);
    return Integer.parseInt(now) * (int)Math.pow(2, len-1) + binaryToDecimal(later);     
  }
}
*/

/*
import java.util.Scanner;
 
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    
	    //Input the binary number
		System.out.println("Enter a Binary");
		int binary = in.nextInt();
		
		//pass the binary number to the recursive function
		//and print the result returned
		System.out.println("Decimal: "+binToDec(binary, 0));
	}
	
	//'i' represents the nth recursive call as well as
    //nth digit from left, so it can be used as an exponent
    private static int binToDec(int bin, int i){
        //base condition
        if(bin == 0 || bin == 1)
            return (int)Math.pow(2,i)*bin;
        
        //extract digit
        int lastDigit = bin%10;
        
        //return the arithemetic result with next recusive call
        return (int)(Math.pow(2,i) * lastDigit) + binToDec(bin/10, ++i);
     
    }
}
*/