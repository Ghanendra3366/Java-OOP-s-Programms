import java.util.Scanner;

public class StockBuySellAtMostKTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int[][] dp = new int[k + 1][n];
        for (int i = 1; i <= k; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j < n; j++) {
                max = Math.max(max, dp[i - 1][j - 1] - arr[j - 1]);
                dp[i][j] = Math.max(dp[i][j - 1], max + arr[j]);
            }
        }
        System.out.println("Max profit: " + dp[k][n - 1]);
    }
}