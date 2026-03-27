import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class SortAccordingToOrderDefinedByAnother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter order size: ");
        int m = sc.nextInt();
        int[] order = new int[m];
        System.out.print("Enter order: ");
        for (int i = 0; i < m; i++) order[i] = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) map.put(order[i], i);
        Integer[] boxed = new Integer[n];
        for (int i = 0; i < n; i++) boxed[i] = arr[i];
        Arrays.sort(boxed, (a, b) -> {
            if (map.containsKey(a) && map.containsKey(b)) return map.get(a) - map.get(b);
            if (map.containsKey(a)) return -1;
            if (map.containsKey(b)) return 1;
            return a - b;
        });
        System.out.println("Sorted: " + Arrays.toString(boxed));
    }
}