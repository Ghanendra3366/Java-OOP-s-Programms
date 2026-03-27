import java.util.Scanner;

public class SentinelLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        arr[n] = target;
        int i = 0;
        while (arr[i] != target) i++;
        if (i < n) {
            System.out.println("Found at: " + i);
        } else {
            System.out.println("Not found");
        }
    }
}