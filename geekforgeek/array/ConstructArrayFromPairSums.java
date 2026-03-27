import java.util.Scanner;

public class ConstructArrayFromPairSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] pairSums = new int[n * (n - 1) / 2];
        System.out.print("Enter pair sums: ");
        for (int i = 0; i < pairSums.length; i++) pairSums[i] = sc.nextInt();
        // This is complex, assuming sorted pair sums
        int[] arr = new int[n];
        arr[0] = (pairSums[0] + pairSums[1] - pairSums[n - 2]) / 2;
        for (int i = 1; i < n; i++) {
            arr[i] = pairSums[i - 1] - arr[0];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}