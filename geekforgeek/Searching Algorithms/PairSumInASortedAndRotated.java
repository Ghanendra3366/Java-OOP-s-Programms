import java.util.Scanner;

public class PairSumInASortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter sum: ");
        int sum = sc.nextInt();
        int i = 0;
        for (i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) break;
        }
        int l = (i + 1) % n;
        int r = i;
        while (l != r) {
            if (arr[l] + arr[r] == sum) {
                System.out.println("Pair: " + arr[l] + " " + arr[r]);
                return;
            } else if (arr[l] + arr[r] < sum) {
                l = (l + 1) % n;
            } else {
                r = (n + r - 1) % n;
            }
        }
        System.out.println("No pair");
    }
}