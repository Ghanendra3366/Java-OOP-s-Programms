import java.util.Scanner;
import java.util.HashMap;

public class SubarrayWithSumDivisibleByK {
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
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int rem = sum % k;
            if (rem < 0) rem += k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        System.out.println("Subarrays count: " + count);
    }
}