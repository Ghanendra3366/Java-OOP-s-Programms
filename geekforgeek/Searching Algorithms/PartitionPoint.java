import java.util.Scanner;

public class PartitionPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int total = 0;
        for (int i = 0; i < n; i++) total += arr[i];
        int left = 0;
        for (int i = 0; i < n; i++) {
            if (left == total - left - arr[i]) {
                System.out.println("Partition at: " + i);
                return;
            }
            left += arr[i];
        }
        System.out.println("No partition");
    }
}