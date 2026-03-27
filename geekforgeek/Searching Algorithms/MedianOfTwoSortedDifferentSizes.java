import java.util.Scanner;

public class MedianOfTwoSortedDifferentSizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n m: ");
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n], b = new int[m];
        System.out.print("Enter a: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter b: ");
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        if (n > m) {
            int[] temp = a;
            a = b;
            b = temp;
            int t = n;
            n = m;
            m = t;
        }
        int total = n + m;
        int half = (total + 1) / 2;
        int low = 0, high = n;
        while (low <= high) {
            int i = (low + high) / 2;
            int j = half - i;
            int aLeft = (i == 0) ? Integer.MIN_VALUE : a[i - 1];
            int aRight = (i == n) ? Integer.MAX_VALUE : a[i];
            int bLeft = (j == 0) ? Integer.MIN_VALUE : b[j - 1];
            int bRight = (j == m) ? Integer.MAX_VALUE : b[j];
            if (aLeft <= bRight && bLeft <= aRight) {
                if (total % 2 == 1) {
                    System.out.println("Median: " + Math.max(aLeft, bLeft));
                } else {
                    System.out.println("Median: " + (Math.max(aLeft, bLeft) + Math.min(aRight, bRight)) / 2.0);
                }
                return;
            } else if (aLeft > bRight) {
                high = i - 1;
            } else {
                low = i + 1;
            }
        }
    }
}