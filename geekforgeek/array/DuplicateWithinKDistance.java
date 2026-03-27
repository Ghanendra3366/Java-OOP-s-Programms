import java.util.Scanner;

public class DuplicateWithinKDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= i + k && j < n; j++) {
                if (arr[i] == arr[j]) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        System.out.println(found ? "Yes" : "No");
    }
}