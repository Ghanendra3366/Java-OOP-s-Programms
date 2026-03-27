import java.util.Scanner;

public class SpaceOptimizationUsingBitManipulations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int xor = 0;
        for (int i = 0; i < n; i++) xor ^= arr[i];
        System.out.println("XOR: " + xor);
    }
}