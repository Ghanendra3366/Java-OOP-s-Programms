import java.util.Scanner;

public class SearchInAnAlmostSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                System.out.println("Found at: " + i);
                return;
            }
        }
        System.out.println("Not found");
    }
}