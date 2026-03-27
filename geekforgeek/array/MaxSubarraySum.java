import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int max = arr[0], current = arr[0];
        for (int i = 1; i < n; i++) {
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }
        System.out.println("Max subarray sum: " + max);
    }
}