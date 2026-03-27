import java.util.Scanner;
import java.util.HashSet;

public class CheckForEqual {
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
        if (n1 != n2) {
            System.out.println("Not equal");
            return;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n1; i++) set.add(a[i]);
        boolean equal = true;
        for (int i = 0; i < n2; i++) {
            if (!set.contains(b[i])) {
                equal = false;
                break;
            }
        }
        System.out.println(equal ? "Equal" : "Not equal");
    }
}