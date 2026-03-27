import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class SortByFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < n; i++) freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        List<Integer> list = new ArrayList<>(freq.keySet());
        list.sort((a, b) -> freq.get(b) - freq.get(a));
        System.out.print("Sorted by frequency: ");
        for (int num : list) {
            for (int i = 0; i < freq.get(num); i++) System.out.print(num + " ");
        }
        System.out.println();
    }
}