import java.util.Scanner;
import java.util.Arrays;

public class MergeWithoutExtraSpace {
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
        int i = n1 - 1, j = 0;
        while (i >= 0 && j < n2) {
            if (a[i] > b[j]) {
                int temp = a[i];
                a[i] = b[j];
                b[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println("Merged a: " + Arrays.toString(a));
        System.out.println("Merged b: " + Arrays.toString(b));
    }
}