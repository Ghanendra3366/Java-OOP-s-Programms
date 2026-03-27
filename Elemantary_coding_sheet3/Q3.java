package JAVA.Elemantary_coding_sheet3;
// import java.io.*;
// import java.util.*;

class Q3 {
    public static String addNumberStrings(String input1, String input2) {
        StringBuilder result = new StringBuilder();
        int i = input1.length() - 1;
        int j = input2.length() - 1;
        int carry = 0;
        
        // Process both strings from the end (least significant digit)
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            
            if (i >= 0) {
                sum += input1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += input2.charAt(j) - '0';
                j--;
            }
            
            carry = sum / 10;
            result.append(sum % 10);
        }
        
        // Reverse the result since we built it backwards
        return result.reverse().toString();
    }
}
