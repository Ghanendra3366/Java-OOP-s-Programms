import java.util.Scanner;
import java.util.HashMap;

public class TwoSumCountPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(target - arr[i])) {
                count += map.get(target - arr[i]);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Pairs count: " + count);
    }
}