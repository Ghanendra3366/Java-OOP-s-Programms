import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n - 1; i++) arr[i] = sc.nextInt();
        int sum = n * (n + 1) / 2;
        int arrSum = 0;
        for (int i = 0; i < n - 1; i++) arrSum += arr[i];
        System.out.println("Missing: " + (sum - arrSum));
    }
}