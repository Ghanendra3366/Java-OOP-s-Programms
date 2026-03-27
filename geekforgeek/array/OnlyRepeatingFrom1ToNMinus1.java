import java.util.Scanner;

public class OnlyRepeatingFrom1ToNMinus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int xor = 0;
        for (int i = 0; i < n; i++) xor ^= arr[i];
        for (int i = 1; i < n; i++) xor ^= i;
        System.out.println("Repeating: " + xor);
    }
}