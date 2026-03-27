import java.util.Scanner;
import java.util.HashSet;

public class TwoSumFindIfThereIsAnyPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (set.contains(target - arr[i])) {
                found = true;
                break;
            }
            set.add(arr[i]);
        }
        System.out.println(found ? "Pair exists" : "No pair");
    }
}