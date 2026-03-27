import java.util.Scanner;

public class TernarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid1 = low + (high - low) / 3;
            int mid2 = high - (high - low) / 3;
            if (arr[mid1] == target) {
                System.out.println("Found at: " + mid1);
                return;
            }
            if (arr[mid2] == target) {
                System.out.println("Found at: " + mid2);
                return;
            }
            if (target < arr[mid1]) {
                high = mid1 - 1;
            } else if (target > arr[mid2]) {
                low = mid2 + 1;
            } else {
                low = mid1 + 1;
                high = mid2 - 1;
            }
        }
        System.out.println("Not found");
    }
}