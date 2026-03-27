import java.util.Scanner;

public class InterpolationSearch {
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
        while (low <= high && target >= arr[low] && target <= arr[high]) {
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);
            if (arr[pos] == target) {
                System.out.println("Found at: " + pos);
                return;
            }
            if (arr[pos] < target) {
                low = pos + 1;
            } else {
                high = pos - 1;
            }
        }
        System.out.println("Not found");
    }
}