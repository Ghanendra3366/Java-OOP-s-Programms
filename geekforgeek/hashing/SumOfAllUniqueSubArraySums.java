import java.util.Scanner;
import java.util.HashSet;

public class SumOfAllUniqueSubArraySums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashSet<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                set.add(sum);
            }
        }
        long total = 0;
        for (long s : set) total += s;
        System.out.println("Sum of unique subarray sums: " + total);
    }
}