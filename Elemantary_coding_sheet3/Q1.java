package JAVA.Elemantary_coding_sheet3;

import java.util.*;

public class Q1 {

    public static long findStringCode(String input1) {
        String sentence = input1.trim();
        String[] words = sentence.split(" ");
        
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            // Convert to uppercase for uniform processing
            word = word.toUpperCase();
            
            int sum = 0;
            int left = 0;
            int right = word.length() - 1;
            
            // Pair letters from edges inward
            while (left <= right) {
                if (left == right) {
                    // Middle character (odd length word): add its value
                    char midChar = word.charAt(left);
                    int midVal = midChar - 'A' + 1;
                    sum += midVal;
                } else {
                    // Pair: add absolute difference
                    char leftChar = word.charAt(left);
                    char rightChar = word.charAt(right);
                    
                    int leftVal = leftChar - 'A' + 1;
                    int rightVal = rightChar - 'A' + 1;
                    
                    sum += Math.abs(leftVal - rightVal);
                }
                
                left++;
                right--;
            }
            
            result.append(sum);
        }
        
        // Convert to long
        return Long.parseLong(result.toString());
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine().trim();
            System.out.print(findStringCode(input));
        }
    }

}
