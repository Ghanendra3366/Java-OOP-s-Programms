import java.util.Scanner;

public class TwoNonRepeatingInAnArrayOfRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        int xor = 0;
        for (int num : arr) xor ^= num;
        int setBit = xor & -xor;
        int x = 0, y = 0;
        for (int num : arr) {
            if ((num & setBit) != 0) x ^= num;
            else y ^= num;
        }
        System.out.println("Non-repeating: " + x + " and " + y);
    }
}