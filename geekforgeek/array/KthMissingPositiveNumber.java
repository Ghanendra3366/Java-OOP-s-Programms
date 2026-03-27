import java.util.Scanner;

public class KthMissingPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int missing = 0;
        int i = 0;
        while (k > 0) {
            missing++;
            if (i < n && arr[i] == missing) {
                i++;
            } else {
                k--;
            }
        }
        System.out.println("Kth missing: " + missing);
    }
}