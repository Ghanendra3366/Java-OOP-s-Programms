import java.util.Scanner;
import java.util.HashMap;

public class KthDistinctOrNonRepeating {
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
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) == 1) {
                count++;
                if (count == k) {
                    System.out.println("Kth distinct: " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
}