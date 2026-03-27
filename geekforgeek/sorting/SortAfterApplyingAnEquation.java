import java.util.Scanner;
import java.util.Arrays;

public class SortAfterApplyingAnEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter a and b: ");
        int a = sc.nextInt(), b = sc.nextInt();
        Integer[] boxed = new Integer[n];
        for (int i = 0; i < n; i++) boxed[i] = arr[i];
        Arrays.sort(boxed, (x, y) -> Integer.compare(a * x + b, a * y + b));
        System.out.println("Sorted: " + Arrays.toString(boxed));
    }
}