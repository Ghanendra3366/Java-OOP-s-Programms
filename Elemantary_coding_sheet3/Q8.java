package JAVA.Elemantary_coding_sheet3;

public class Q8 {
    public int sumOfSumsOfDigits(int input1){
    String s = String.valueOf(Math.abs(input1));
    int n = s.length();
    int totalSum = 0;
    int currentSum = 0;
    
    // First pass: compute total sum of all digits
    for (int i = 0; i < n; i++) {
        currentSum += s.charAt(i) - '0';
    }
    
    // Second pass: add suffix sums cumulatively
    for (int i = 0; i < n; i++) {
        totalSum += currentSum;
        currentSum -= s.charAt(i) - '0';  // Remove leftmost digit for next suffix
    }
    
    return totalSum;
}
}
