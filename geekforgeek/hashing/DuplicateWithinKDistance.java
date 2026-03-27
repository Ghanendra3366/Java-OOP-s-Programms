import java.util.Scanner;
import java.util.HashSet;

public class DuplicateWithinKDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                found = true;
                break;
            }
            set.add(arr[i]);
            if (i >= k) set.remove(arr[i - k]);
        }
        System.out.println(found ? "Duplicate within k" : "No duplicate within k");
    }
}