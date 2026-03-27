import java.util.Scanner;
import java.util.Arrays;

public class SortStringsByLengths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.print("Enter strings: ");
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        Arrays.sort(arr, (a, b) -> a.length() - b.length());
        System.out.println("Sorted: " + Arrays.toString(arr));
    }
}