import java.util.Scanner;
import java.util.Stack;

public class MaximumOfMinimumForEveryWindowSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        int[] result = maxOfMin(arr);
        for (int i : result) System.out.print(i + " ");
    }
    static int[] maxOfMin(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) stack.pop();
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        stack.clear();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) stack.pop();
            right[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }
        int[] ans = new int[n + 1];
        for (int i = 0; i < n; i++) {
            int len = right[i] - left[i] - 1;
            ans[len] = Math.max(ans[len], arr[i]);
        }
        for (int i = n - 1; i >= 1; i--) ans[i] = Math.max(ans[i], ans[i + 1]);
        int[] result = new int[n];
        for (int i = 1; i <= n; i++) result[i - 1] = ans[i];
        return result;
    }
}