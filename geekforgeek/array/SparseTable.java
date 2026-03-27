import java.util.Scanner;

public class SparseTable {
    static int[][] st;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int log = (int) (Math.log(n) / Math.log(2)) + 1;
        st = new int[n][log];
        for (int i = 0; i < n; i++) st[i][0] = arr[i];
        for (int j = 1; j < log; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                st[i][j] = Math.min(st[i][j - 1], st[i + (1 << (j - 1))][j - 1]);
            }
        }
        System.out.print("Enter l r: ");
        int l = sc.nextInt(), r = sc.nextInt();
        int k = (int) (Math.log(r - l + 1) / Math.log(2));
        int min = Math.min(st[l][k], st[r - (1 << k) + 1][k]);
        System.out.println("Min: " + min);
    }
}