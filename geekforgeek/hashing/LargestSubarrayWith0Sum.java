import java.util.Scanner;
import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0, maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }
        System.out.println("Largest subarray length: " + maxLen);
    }
}