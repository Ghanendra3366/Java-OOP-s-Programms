import java.util.Scanner;
import java.util.Arrays;

public class SortWhenTwoHalvesAreSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int mid = n / 2;
        Arrays.sort(arr, 0, mid);
        Arrays.sort(arr, mid, n);
        int[] merged = new int[n];
        int i = 0, j = mid, k = 0;
        while (i < mid && j < n) {
            if (arr[i] < arr[j]) merged[k++] = arr[i++];
            else merged[k++] = arr[j++];
        }
        while (i < mid) merged[k++] = arr[i++];
        while (j < n) merged[k++] = arr[j++];
        System.out.println("Sorted: " + Arrays.toString(merged));
    }
}