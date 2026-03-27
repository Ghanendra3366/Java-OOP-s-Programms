import java.util.Scanner;
import java.util.HashMap;

public class DistinctsInEveryWindowOfSizeK {
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
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print(map.size() + " ");
        for (int i = k; i < n; i++) {
            map.put(arr[i - k], map.get(arr[i - k]) - 1);
            if (map.get(arr[i - k]) == 0) map.remove(arr[i - k]);
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.print(map.size() + " ");
        }
        System.out.println();
    }
}