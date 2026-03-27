import java.util.Scanner;
import java.util.Arrays;

public class SortBySetBitsCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Integer[] boxed = new Integer[n];
        for (int i = 0; i < n; i++) boxed[i] = arr[i];
        Arrays.sort(boxed, (a, b) -> Integer.bitCount(b) - Integer.bitCount(a));
        System.out.println("Sorted by set bits: " + Arrays.toString(boxed));
    }
}