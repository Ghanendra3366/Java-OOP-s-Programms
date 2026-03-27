import java.util.Scanner;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(arr[i]);
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i] - 1)) {
                int len = 1;
                while (set.contains(arr[i] + len)) len++;
                maxLen = Math.max(maxLen, len);
            }
        }
        System.out.println("Longest consecutive: " + maxLen);
    }
}