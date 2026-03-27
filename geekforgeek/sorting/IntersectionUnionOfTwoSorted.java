import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionUnionOfTwoSorted {
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
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> inter = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (a[i] < b[j]) {
                union.add(a[i++]);
            } else if (a[i] > b[j]) {
                union.add(b[j++]);
            } else {
                union.add(a[i]);
                inter.add(a[i]);
                i++; j++;
            }
        }
        while (i < n1) union.add(a[i++]);
        while (j < n2) union.add(b[j++]);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + inter);
    }
}