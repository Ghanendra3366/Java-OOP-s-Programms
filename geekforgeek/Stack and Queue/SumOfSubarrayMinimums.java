import java.util.Scanner;
import java.util.Stack;

public class SumOfSubarrayMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        int sum = sumSubarrayMins(arr);
        System.out.println("Sum: " + sum);
    }
    static int sumSubarrayMins(int[] arr) {
        int MOD = 1000000007;
        Stack<Integer> stack = new Stack<>();
        long sum = 0;
        for (int i = 0; i <= arr.length; i++) {
            while (!stack.isEmpty() && (i == arr.length || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int left = stack.isEmpty() ? -1 : stack.peek();
                int right = i;
                long count = (mid - left) * (right - mid);
                sum = (sum + arr[mid] * count) % MOD;
            }
            stack.push(i);
        }
        return (int) sum;
    }
}