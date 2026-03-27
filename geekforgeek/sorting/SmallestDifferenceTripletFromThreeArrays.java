import java.util.Scanner;
import java.util.Arrays;

public class SmallestDifferenceTripletFromThreeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n], c = new int[n];
        System.out.print("Enter a: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter b: ");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        System.out.print("Enter c: ");
        for (int i = 0; i < n; i++) c[i] = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        int i = 0, j = 0, k = 0;
        int minDiff = Integer.MAX_VALUE;
        while (i < n && j < n && k < n) {
            int max = Math.max(a[i], Math.max(b[j], c[k]));
            int min = Math.min(a[i], Math.min(b[j], c[k]));
            minDiff = Math.min(minDiff, max - min);
            if (a[i] == min) i++;
            else if (b[j] == min) j++;
            else k++;
        }
        System.out.println("Smallest difference: " + minDiff);
    }
}