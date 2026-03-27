import java.util.Scanner;
import java.util.Arrays;

public class MinAndMaxAmountToBuyAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int min = 0, max = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) min += arr[i];
            else max += arr[i];
        }
        System.out.println("Min: " + min + ", Max: " + max);
    }
}