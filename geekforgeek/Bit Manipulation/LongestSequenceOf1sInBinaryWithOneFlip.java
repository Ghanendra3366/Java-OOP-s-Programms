import java.util.Scanner;

public class LongestSequenceOf1sInBinaryWithOneFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int maxLen = longestSequence(n);
        System.out.println("Longest sequence: " + maxLen);
    }
    static int longestSequence(int n) {
        if (~n == 0) return Integer.BYTES * 8;
        int maxLen = 1;
        int prevLen = 0, currLen = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                currLen++;
            } else {
                prevLen = (n & 2) == 0 ? 0 : currLen;
                currLen = 0;
            }
            maxLen = Math.max(maxLen, prevLen + currLen + 1);
            n >>= 1;
        }
        return maxLen;
    }
}