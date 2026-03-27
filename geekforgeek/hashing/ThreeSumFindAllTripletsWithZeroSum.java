import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ThreeSumFindAllTripletsWithZeroSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) map.put(arr[i], i);
        List<String> triplets = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int needed = -arr[i] - arr[j];
                if (map.containsKey(needed) && map.get(needed) > j) {
                    triplets.add(arr[i] + "," + arr[j] + "," + needed);
                }
            }
        }
        System.out.println("Triplets: " + triplets);
    }
}