import java.util.Scanner;

public class MedianOfTwoSortedSameSizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        System.out.print("Enter a: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter b: ");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        int i = 0, j = 0;
        for (int count = 0; count <= n; count++) {
            if (i == n) {
                System.out.println("Median: " + b[0]);
                return;
            }
            if (j == n) {
                System.out.println("Median: " + a[0]);
                return;
            }
            if (a[i] < b[j]) {
                if (count == n - 1) {
                    System.out.println("Median: " + a[i]);
                    return;
                }
                i++;
            } else {
                if (count == n - 1) {
                    System.out.println("Median: " + b[j]);
                    return;
                }
                j++;
            }
        }
    }
}