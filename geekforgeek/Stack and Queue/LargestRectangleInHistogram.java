import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] hist = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter hist[" + i + "]: ");
            hist[i] = sc.nextInt();
        }
        int maxArea = largestRectangleArea(hist);
        System.out.println("Max Area: " + maxArea);
    }
    static int largestRectangleArea(int[] hist) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < hist.length) {
            if (stack.isEmpty() || hist[stack.peek()] <= hist[i]) stack.push(i++);
            else {
                int tp = stack.pop();
                int area = hist[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int tp = stack.pop();
            int area = hist[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}