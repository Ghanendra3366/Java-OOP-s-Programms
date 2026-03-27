import java.util.Scanner;
import java.util.HashMap;

public class SmallestSubarrayWithKDistinctNumbers {
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
        int left = 0, minLen = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
            while (map.size() == k && left <= right) {
                minLen = Math.min(minLen, right - left + 1);
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) map.remove(arr[left]);
                left++;
            }
        }
        System.out.println("Smallest subarray length: " + (minLen == Integer.MAX_VALUE ? 0 : minLen));
    }
}