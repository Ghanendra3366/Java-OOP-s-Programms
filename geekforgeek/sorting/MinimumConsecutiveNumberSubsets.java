import java.util.Scanner;
import java.util.Arrays;

public class MinimumConsecutiveNumberSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int minLen = n;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && arr[j] - arr[i] <= n - 1) j++;
            minLen = Math.min(minLen, j - i);
        }
        System.out.println("Min consecutive subset length: " + minLen);
    }
}