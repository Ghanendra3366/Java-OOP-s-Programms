import java.util.Scanner;

public class OddOccurringNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for (int num : arr) result ^= num;
        System.out.println("Odd occurring number: " + result);
    }
}