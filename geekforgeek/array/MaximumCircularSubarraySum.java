import java.util.Scanner;

public class MaximumCircularSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int maxKadane = kadane(arr);
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += arr[i];
            arr[i] = -arr[i];
        }
        int maxWrap = total + kadane(arr);
        System.out.println("Max circular sum: " + Math.max(maxKadane, maxWrap));
    }

    static int kadane(int[] arr) {
        int max = arr[0], current = arr[0];
        for (int i = 1; i < arr.length; i++) {
            current = Math.max(arr[i], current + arr[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}