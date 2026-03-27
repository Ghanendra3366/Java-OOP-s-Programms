import java.util.Scanner;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] temperatures = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter temperatures[" + i + "]: ");
            temperatures[i] = sc.nextInt();
        }
        int[] result = dailyTemperatures(temperatures);
        for (int i : result) System.out.print(i + " ");
    }
    static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }
        return result;
    }
}