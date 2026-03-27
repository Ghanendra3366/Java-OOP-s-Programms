import java.util.Scanner;
import java.util.HashMap;

public class LongestStrictBitonicSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] inc = new int[n];
        int[] dec = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            inc[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) inc[i] = Math.max(inc[i], inc[j] + 1);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            dec[i] = 1;
            for (int j = n - 1; j > i; j--) {
                if (arr[i] > arr[j]) dec[i] = Math.max(dec[i], dec[j] + 1);
            }
        }
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            maxLen = Math.max(maxLen, inc[i] + dec[i] - 1);
        }
        System.out.println("Longest bitonic: " + maxLen);
    }
}