import java.util.Scanner;

public class Count1sInSortedBinaryArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Count of 1s: " + (n - low));
    }
}