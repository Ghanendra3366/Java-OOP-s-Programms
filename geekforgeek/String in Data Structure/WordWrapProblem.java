import java.util.Scanner;

public class WordWrapProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.next();
        System.out.print("Enter line width: ");
        int width = sc.nextInt();
        int cost = wordWrap(words, width);
        System.out.println("Cost: " + cost);
    }
    static int wordWrap(String[] words, int width) {
        int n = words.length;
        int[] dp = new int[n];
        java.util.Arrays.fill(dp, Integer.MAX_VALUE);
        dp[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            int len = -1;
            for (int j = i; j < n; j++) {
                len += words[j].length() + 1;
                if (len > width) break;
                int cost = (j == n - 1) ? 0 : (width - len) * (width - len);
                if (dp[j] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], cost + dp[j]);
                }
            }
        }
        return dp[0];
    }
}