import java.util.Scanner;

public class WindowSlidingTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int max = 0;
        for (int i = 0; i < k; i++) max += arr[i];
        int current = max;
        for (int i = k; i < n; i++) {
            current += arr[i] - arr[i - k];
            if (current > max) max = current;
        }
        System.out.println("Max sum: " + max);
    }
}