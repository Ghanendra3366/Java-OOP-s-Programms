package JAVA.Elemantary_coding_sheet3;

import java.util.*;

public class Q2 {

    public static int getCodeThroughStrings(String input1) {
        String sentence = input1.trim();
        String[] words = sentence.split(" ");
        
        // Calculate total length of all words
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        
        // Repeatedly sum digits until we get a single digit
        while (totalLength >= 10) {
            totalLength = digitSum(totalLength);
        }
        
        return totalLength;
    }
    
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine().trim();
            System.out.print(getCodeThroughStrings(input));
        }
    }

}
