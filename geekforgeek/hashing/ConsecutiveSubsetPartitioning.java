import java.util.Scanner;
import java.util.HashMap;

public class ConsecutiveSubsetPartitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int partitions = 0;
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i] - 1)) {
                partitions++;
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Partitions: " + partitions);
    }
}