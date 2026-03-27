import java.util.Scanner;
import java.util.Arrays;

public class SortFromDifferentMachines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}