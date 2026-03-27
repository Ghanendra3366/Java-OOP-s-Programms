import java.util.Scanner;

public class StockBuySellAtMost2Transactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int buy1 = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE;
        int sell1 = 0, sell2 = 0;
        for (int i = 0; i < n; i++) {
            buy1 = Math.min(buy1, arr[i]);
            sell1 = Math.max(sell1, arr[i] - buy1);
            buy2 = Math.min(buy2, arr[i] - sell1);
            sell2 = Math.max(sell2, arr[i] - buy2);
        }
        System.out.println("Max profit: " + sell2);
    }
}