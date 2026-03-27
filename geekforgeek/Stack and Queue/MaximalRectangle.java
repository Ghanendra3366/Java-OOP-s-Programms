import java.util.Scanner;
import java.util.Stack;

public class MaximalRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter cols: ");
        int n = sc.nextInt();
        char[][] matrix = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter matrix[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.next().charAt(0);
            }
        }
        int maxArea = maximalRectangle(matrix);
        System.out.println("Max Area: " + maxArea);
    }
    static int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int maxArea = 0;
        int[] height = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                height[j] = matrix[i][j] == '1' ? height[j] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(height));
        }
        return maxArea;
    }
    static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < heights.length) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) stack.push(i++);
            else {
                int tp = stack.pop();
                int area = heights[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int tp = stack.pop();
            int area = heights[tp] * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}