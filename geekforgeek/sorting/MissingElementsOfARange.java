import java.util.Scanner;
import java.util.HashSet;

public class MissingElementsOfARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range start and end: ");
        int start = sc.nextInt(), end = sc.nextInt();
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(arr[i]);
        System.out.print("Missing: ");
        for (int i = start; i <= end; i++) {
            if (!set.contains(i)) System.out.print(i + " ");
        }
        System.out.println();
    }
}