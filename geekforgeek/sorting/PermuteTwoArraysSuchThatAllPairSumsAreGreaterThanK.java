import java.util.Scanner;
import java.util.Arrays;

public class PermuteTwoArraysSuchThatAllPairSumsAreGreaterThanK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        System.out.print("Enter a: ");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        System.out.print("Enter b: ");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            if (a[i] + b[n - 1 - i] <= k) {
                possible = false;
                break;
            }
        }
        System.out.println(possible ? "Possible" : "Not possible");
    }
}