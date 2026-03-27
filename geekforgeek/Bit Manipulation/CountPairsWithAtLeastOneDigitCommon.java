import java.util.Scanner;

public class CountPairsWithAtLeastOneDigitCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (hasCommonDigit(arr[i], arr[j])) count++;
            }
        }
        System.out.println("Pairs: " + count);
    }
    static boolean hasCommonDigit(int a, int b) {
        boolean[] digitsA = new boolean[10];
        while (a > 0) {
            digitsA[a % 10] = true;
            a /= 10;
        }
        while (b > 0) {
            if (digitsA[b % 10]) return true;
            b /= 10;
        }
        return false;
    }
}