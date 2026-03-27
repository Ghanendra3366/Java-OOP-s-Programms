import java.util.Scanner;

public class MinimumAdditionsAtFrontToMakePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int adds = minAdditions(s);
        System.out.println("Min additions: " + adds);
    }
    static int minAdditions(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        int lcs = longestCommonSubsequence(s, rev);
        return s.length() - lcs;
    }
    static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length(), n = text2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }
}