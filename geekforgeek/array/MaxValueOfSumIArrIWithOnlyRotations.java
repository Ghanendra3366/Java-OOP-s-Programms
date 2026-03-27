import java.util.Scanner;

public class MaxValueOfSumIArrIWithOnlyRotations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int sum = 0, current = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            current += i * arr[i];
        }
        int max = current;
        for (int i = 1; i < n; i++) {
            current += sum - n * arr[n - i];
            if (current > max) max = current;
        }
        System.out.println("Max sum: " + max);
    }
}