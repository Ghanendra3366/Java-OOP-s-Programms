import java.util.*;

public class Q6 {

    public static int digitRemove_Palin(int input1) {
        String s = Integer.toString(input1);
        
        // Check if already a palindrome
        if (isPalindrome(s)) return -1;
        
        // Try removing each digit at position i
        for (int i = 0; i < s.length(); i++) {
            // Create string without digit at position i
            String temp = s.substring(0, i) + s.substring(i + 1);
            
            if (isPalindrome(temp)) {
                // Return the digit that was removed
                return Character.getNumericValue(s.charAt(i));
            }
        }
        
        // No single digit removal makes it a palindrome
        return -1;
    }
    
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int input = sc.nextInt();
            System.out.print(digitRemove_Palin(input));
        }
    }

}
