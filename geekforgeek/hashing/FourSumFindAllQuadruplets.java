import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class FourSumFindAllQuadruplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        HashMap<Integer, int[]> map = new HashMap<>();
        List<String> quads = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = arr[i] + arr[j];
                int needed = target - sum;
                if (map.containsKey(needed)) {
                    int[] pair = map.get(needed);
                    quads.add(pair[0] + "," + pair[1] + "," + arr[i] + "," + arr[j]);
                }
            }
            for (int j = 0; j < i; j++) {
                int sum = arr[i] + arr[j];
                map.put(sum, new int[]{arr[j], arr[i]});
            }
        }
        System.out.println("Quadruplets: " + quads);
    }
}