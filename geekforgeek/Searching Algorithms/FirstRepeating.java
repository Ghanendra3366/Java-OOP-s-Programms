import java.util.Scanner;
import java.util.HashSet;

public class FirstRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int first = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                first = arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        System.out.println("First repeating: " + first);
    }
}