import java.util.Scanner;
import java.util.Arrays;

public class MergeTwoSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.print("Enter first array: ");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();
        System.out.print("Enter size of second: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.print("Enter second array: ");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) merged[k++] = a[i++];
            else merged[k++] = b[j++];
        }
        while (i < n1) merged[k++] = a[i++];
        while (j < n2) merged[k++] = b[j++];
        System.out.println("Merged: " + Arrays.toString(merged));
    }
}