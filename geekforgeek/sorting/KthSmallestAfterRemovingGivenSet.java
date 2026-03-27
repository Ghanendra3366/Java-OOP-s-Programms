import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;

public class KthSmallestAfterRemovingGivenSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter set size: ");
        int m = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        System.out.print("Enter set elements: ");
        for (int i = 0; i < m; i++) set.add(sc.nextInt());
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {
                count++;
                if (count == k) {
                    System.out.println("Kth smallest: " + arr[i]);
                    return;
                }
            }
        }
        System.out.println("Not found");
    }
}