import java.util.Scanner;
import java.util.HashMap;

public class MaxDistanceBetweenTwoOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxDist = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                maxDist = Math.max(maxDist, i - map.get(arr[i]));
            } else {
                map.put(arr[i], i);
            }
        }
        System.out.println("Max distance: " + maxDist);
    }
}