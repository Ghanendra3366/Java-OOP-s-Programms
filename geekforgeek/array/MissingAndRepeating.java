import java.util.Scanner;

public class MissingAndRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int xor = 0;
        for (int i = 1; i <= n; i++) xor ^= i;
        for (int i = 0; i < n; i++) xor ^= arr[i];
        int setBit = xor & ~(xor - 1);
        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            if ((arr[i] & setBit) != 0) x ^= arr[i];
            else y ^= arr[i];
        }
        for (int i = 1; i <= n; i++) {
            if ((i & setBit) != 0) x ^= i;
            else y ^= i;
        }
        System.out.println("Missing: " + x + ", Repeating: " + y);
    }
}