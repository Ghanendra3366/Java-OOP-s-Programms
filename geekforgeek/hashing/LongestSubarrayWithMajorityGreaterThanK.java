import java.util.Scanner;
import java.util.HashMap;

public class LongestSubarrayWithMajorityGreaterThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (map.get(arr[i]) > k) {
                maxLen = Math.max(maxLen, i + 1);
            }
        }
        System.out.println("Longest subarray: " + maxLen);
    }
}