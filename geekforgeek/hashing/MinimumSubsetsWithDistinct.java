import java.util.Scanner;
import java.util.HashSet;

public class MinimumSubsetsWithDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int subsets = 0;
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                subsets++;
                set.clear();
            }
            set.add(arr[i]);
        }
        subsets++;
        System.out.println("Minimum subsets: " + subsets);
    }
}