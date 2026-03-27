import java.util.Scanner;
import java.util.Arrays;

public class SortEvenAndOddPlacedInDifferentOrders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] even = new int[n / 2 + 1];
        int[] odd = new int[n / 2 + 1];
        int e = 0, o = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) even[e++] = arr[i];
            else odd[o++] = arr[i];
        }
        Arrays.sort(even, 0, e);
        Arrays.sort(odd, 0, o);
        e = 0; o = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) arr[i] = even[e++];
            else arr[i] = odd[o++];
        }
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}