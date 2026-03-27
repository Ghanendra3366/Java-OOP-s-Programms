import java.util.Scanner;

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = arr[0];
        for (int i = 1; i < n; i++) left[i] = Math.max(left[i - 1], arr[i]);
        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) right[i] = Math.max(right[i + 1], arr[i]);
        int water = 0;
        for (int i = 0; i < n; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }
        System.out.println("Trapped water: " + water);
    }
}