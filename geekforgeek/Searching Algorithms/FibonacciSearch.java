import java.util.Scanner;

public class FibonacciSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        int fib2 = 0, fib1 = 1, fib = fib2 + fib1;
        while (fib < n) {
            fib2 = fib1;
            fib1 = fib;
            fib = fib2 + fib1;
        }
        int offset = -1;
        while (fib > 1) {
            int i = Math.min(offset + fib2, n - 1);
            if (arr[i] < target) {
                fib = fib1;
                fib1 = fib2;
                fib2 = fib - fib1;
                offset = i;
            } else if (arr[i] > target) {
                fib = fib2;
                fib1 = fib1 - fib2;
                fib2 = fib - fib1;
            } else {
                System.out.println("Found at: " + i);
                return;
            }
        }
        if (fib1 == 1 && arr[offset + 1] == target) {
            System.out.println("Found at: " + (offset + 1));
        } else {
            System.out.println("Not found");
        }
    }
}