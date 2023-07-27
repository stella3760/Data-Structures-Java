package example;

/**
 *
 * @author seunghyekim
 */
public class PrimeFinder {
    
    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Method to find primes using an iterative approach
    public static void findPrimesIterative(int[] arr) {
        for (int num : arr) {
            if (isPrime(num)) {
                System.out.println(num);
            }
        }
    }

    // Method to find primes using a recursive approach
    public static void findPrimesRecursive(int[] arr, int index) {
        if (index == arr.length) {
            return;
        }
        if (isPrime(arr[index])) {
            System.out.println(arr[index]);
        }
        findPrimesRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {3, 32, 5, 354, 139, 2345, 113};
        System.out.println("Iterative method:");
        findPrimesIterative(arr);
        System.out.println("Recursive method:");
        findPrimesRecursive(arr, 0);
    }
}
