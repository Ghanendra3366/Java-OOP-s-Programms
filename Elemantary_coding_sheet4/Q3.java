import java.io.*;
import java.util.*;

public class Q3 {

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Main method to calculate sum of non-prime index values
    public static int sumOfNonPrimeIndexValues(int[] input1, int input2) {
        int sum = 0;
        
        // Iterate through all indices
        for (int i = 0; i < input2; i++) {
            // Check if index is NOT prime
            if (!isPrime(i)) {
                sum += input1[i];
            }
        }
        
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = input.nextInt();
            }
            
            System.out.print(sumOfNonPrimeIndexValues(arr, n));
        }
    }

}