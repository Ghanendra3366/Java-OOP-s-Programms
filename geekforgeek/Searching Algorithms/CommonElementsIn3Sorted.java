import java.util.Scanner;

public class CommonElementsIn3Sorted {
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
        int i = 0, j = 0, k = 0;
        while (i < n && j < n && k < n) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.print(a[i] + " ");
                i++; j++; k++;
            } else if (a[i] < b[j]) {
                i++;
            } else if (b[j] < c[k]) {
                j++;
            } else {
                k++;
            }
        }
        System.out.println();
    }
}