import java.util.Scanner;
import java.util.HashMap;

public class ThreeSumCountAllTripletsWithGivenSum {
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
        for (int i = 0; i < n; i++) map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int needed = target - arr[i] - arr[j];
                if (map.containsKey(needed)) {
                    int freq = map.get(needed);
                    if (needed == arr[i]) freq--;
                    if (needed == arr[j]) freq--;
                    if (freq > 0) count += freq;
                }
            }
        }
        System.out.println("Triplets count: " + (count / 6)); // since each triplet counted 6 times
    }
}