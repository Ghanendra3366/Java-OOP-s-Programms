import java.util.Scanner;

public class SumOfAllSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (long) arr[i] * (i + 1) * (n - i);
        }
        System.out.println("Sum: " + sum);
    }
}