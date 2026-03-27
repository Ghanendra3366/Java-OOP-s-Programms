import java.util.Scanner;

public class ExponentialSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        if (arr[0] == target) {
            System.out.println("Found at: 0");
            return;
        }
        int i = 1;
        while (i < n && arr[i] <= target) {
            i *= 2;
        }
        int low = i / 2, high = Math.min(i, n - 1);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at: " + mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}