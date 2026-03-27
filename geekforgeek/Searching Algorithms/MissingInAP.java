import java.util.Scanner;

public class MissingInAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int diff = (arr[n - 1] - arr[0]) / n;
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] != diff) {
                System.out.println("Missing: " + (arr[i - 1] + diff));
                break;
            }
        }
    }
}