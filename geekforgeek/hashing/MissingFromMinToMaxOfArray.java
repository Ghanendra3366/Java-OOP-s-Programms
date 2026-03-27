import java.util.Scanner;
import java.util.HashSet;

public class MissingFromMinToMaxOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.print("Missing: ");
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}