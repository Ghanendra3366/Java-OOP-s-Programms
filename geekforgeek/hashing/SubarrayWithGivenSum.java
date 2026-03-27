import java.util.Scanner;
import java.util.HashMap;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter sum: ");
        int target = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (map.containsKey(sum - target)) {
                System.out.println("Subarray from " + (map.get(sum - target) + 1) + " to " + i);
                return;
            }
            map.put(sum, i);
        }
        System.out.println("No subarray");
    }
}