import java.util.Scanner;
import java.util.HashMap;

public class FourSumCountQuadruplets {
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
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                int needed = target - sum;
                if (map.containsKey(needed)) {
                    count += map.get(needed);
                }
            }
            for (int j = 0; j < i; j++) {
                int sum = arr[i] + arr[j];
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        System.out.println("Quadruplets count: " + count);
    }
}