import java.util.Scanner;
import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            minDiff = Math.min(minDiff, arr[i + m - 1] - arr[i]);
        }
        System.out.println("Min difference: " + minDiff);
    }
}