import java.util.Scanner;

public class PrefixSumTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + arr[i - 1];
        }
        System.out.print("Enter l r: ");
        int l = sc.nextInt(), r = sc.nextInt();
        System.out.println("Sum from " + l + " to " + r + ": " + (prefix[r + 1] - prefix[l]));
    }
}