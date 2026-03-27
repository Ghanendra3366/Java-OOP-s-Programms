import java.util.Scanner;

public class CountPossibleTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        java.util.Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < n; j++) {
                while (k < n && arr[i] + arr[j] > arr[k]) k++;
                count += k - j - 1;
            }
        }
        System.out.println("Count: " + count);
    }
}