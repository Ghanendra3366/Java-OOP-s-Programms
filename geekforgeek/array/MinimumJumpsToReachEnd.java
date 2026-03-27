import java.util.Scanner;

public class MinimumJumpsToReachEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] jumps = new int[n];
        int[] prev = new int[n];
        jumps[0] = 0;
        for (int i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (int j = 0; j < i; j++) {
                if (j + arr[j] >= i && jumps[j] != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    prev[i] = j;
                }
            }
        }
        System.out.println("Min jumps: " + jumps[n - 1]);
    }
}