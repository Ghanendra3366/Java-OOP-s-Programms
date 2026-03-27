import java.io.*;
import java.util.*;

class Q4 {
    
    public static Result solve(int[] encoded) {

        int n = encoded.length;
        if (n == 0) {
            return new Result(0, 0);
        }
        
        int[] original = new int[n];
        
        // Start from the end
        original[n-1] = encoded[n-1];
        
        // Decode backwards
        for (int i = n-2; i >= 0; i--) {
            original[i] = encoded[i] - original[i+1];
        }
        
        // Now original[0] is the first number
        int first = original[0];
        
        // Calculate sum
        int sum = 0;
        for (int num : original) {
            sum += num;
        }
        
        return new Result(first, sum);
    }
}

public class Result {

    public final int output1;  // first number of original array
    public final int output2;  // sum of all numbers in original array
    
    public Result(int out1, int out2) {
        output1 = out1;
        output2 = out2;
    }
}
public class Main {
    public static void main(String[] args) {
        int[] encoded = {5, 7, 9, 11};
        Result result = Q4.solve(encoded);
        System.out.println("First number of original array: " + result.output1);
        System.out.println("Sum of all numbers in original array: " + result.output2);
    }
}   