import java.util.Scanner;

public class KthLargestSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int[] sums = new int[n * (n + 1) / 2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                sums[idx++] = sum;
            }
        }
        java.util.Arrays.sort(sums);
        System.out.println("Kth largest: " + sums[sums.length - k]);
    }
}