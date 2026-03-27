import java.util.Scanner;

public class CountDistinctSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        long count = countDistinctSubsequences(s);
        System.out.println("Count: " + count);
    }
    static long countDistinctSubsequences(String s) {
        long[] dp = new long[s.length() + 1];
        dp[0] = 1;
        int[] last = new int[256];
        java.util.Arrays.fill(last, -1);
        for (int i = 1; i <= s.length(); i++) {
            dp[i] = 2 * dp[i - 1];
            if (last[s.charAt(i - 1)] != -1) {
                dp[i] -= dp[last[s.charAt(i - 1)]];
            }
            last[s.charAt(i - 1)] = i - 1;
        }
        return dp[s.length()];
    }
}