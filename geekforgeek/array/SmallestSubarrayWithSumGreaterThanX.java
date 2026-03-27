import java.util.Scanner;

public class SmallestSubarrayWithSumGreaterThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        int minLen = Integer.MAX_VALUE;
        int current = 0;
        int start = 0;
        for (int end = 0; end < n; end++) {
            current += arr[end];
            while (current > x && start <= end) {
                minLen = Math.min(minLen, end - start + 1);
                current -= arr[start];
                start++;
            }
        }
        System.out.println("Smallest length: " + (minLen == Integer.MAX_VALUE ? 0 : minLen));
    }
}