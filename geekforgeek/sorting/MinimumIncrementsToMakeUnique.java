import java.util.Scanner;
import java.util.Arrays;

public class MinimumIncrementsToMakeUnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int increments = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] <= arr[i - 1]) {
                increments += arr[i - 1] - arr[i] + 1;
                arr[i] = arr[i - 1] + 1;
            }
        }
        System.out.println("Minimum increments: " + increments);
    }
}