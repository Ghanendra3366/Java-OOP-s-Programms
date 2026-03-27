import java.util.Scanner;

public class SquareRootDecomposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int blockSize = (int) Math.sqrt(n);
        int[] blocks = new int[(n + blockSize - 1) / blockSize];
        for (int i = 0; i < n; i++) {
            blocks[i / blockSize] += arr[i];
        }
        System.out.print("Enter l r: ");
        int l = sc.nextInt(), r = sc.nextInt();
        int sum = 0;
        for (int i = l; i <= r; i++) sum += arr[i];
        System.out.println("Sum: " + sum);
    }
}