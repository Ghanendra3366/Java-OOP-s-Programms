import java.util.Scanner;

public class ThreeWayPartitioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter a and b: ");
        int a = sc.nextInt(), b = sc.nextInt();
        int low = 0, mid = 0, high = n - 1;
        while (mid <= high) {
            if (arr[mid] < a) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] >= a && arr[mid] <= b) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        System.out.println("Partitioned: " + java.util.Arrays.toString(arr));
    }
}