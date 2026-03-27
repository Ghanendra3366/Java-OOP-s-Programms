import java.util.Scanner;

public class SortedSubsequenceOfSize3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int i = 0, j = 0, k = 0;
        for (int idx = 0; idx < n; idx++) {
            if (arr[idx] < min) {
                min = arr[idx];
                i = idx;
            }
        }
        for (int idx = i + 1; idx < n; idx++) {
            if (arr[idx] > arr[i] && arr[idx] < max) {
                max = arr[idx];
                j = idx;
            }
        }
        for (int idx = j + 1; idx < n; idx++) {
            if (arr[idx] > arr[j]) {
                k = idx;
                break;
            }
        }
        if (k > j) {
            System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
        } else {
            System.out.println("No such subsequence");
        }
    }
}