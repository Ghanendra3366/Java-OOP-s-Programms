import java.util.Scanner;

public class SmallestDifferenceTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of arrays: ");
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n], c = new int[n];
        System.out.print("Enter a: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter b: ");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        System.out.print("Enter c: ");
        for (int i = 0; i < n; i++) c[i] = sc.nextInt();
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        java.util.Arrays.sort(c);
        int minDiff = Integer.MAX_VALUE;
        int i = 0, j = 0, k = 0;
        while (i < n && j < n && k < n) {
            int diff = Math.max(Math.max(a[i], b[j]), c[k]) - Math.min(Math.min(a[i], b[j]), c[k]);
            if (diff < minDiff) minDiff = diff;
            if (a[i] <= b[j] && a[i] <= c[k]) i++;
            else if (b[j] <= a[i] && b[j] <= c[k]) j++;
            else k++;
        }
        System.out.println("Min diff: " + minDiff);
    }
}