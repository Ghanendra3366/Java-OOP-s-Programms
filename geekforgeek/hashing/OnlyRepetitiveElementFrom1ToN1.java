import java.util.Scanner;
import java.util.HashSet;

public class OnlyRepetitiveElementFrom1ToN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                System.out.println("Repetitive: " + arr[i]);
                return;
            }
            set.add(arr[i]);
        }
    }
}