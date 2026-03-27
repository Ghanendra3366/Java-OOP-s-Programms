import java.util.Scanner;
import java.util.Stack;

public class NumberOfVisiblePeopleInAQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter heights[" + i + "]: ");
            heights[i] = sc.nextInt();
        }
        int[] result = canSeePersonsCount(heights);
        for (int i : result) System.out.print(i + " ");
    }
    static int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int count = 0;
            while (!stack.isEmpty() && heights[stack.peek()] < heights[i]) {
                stack.pop();
                count++;
            }
            if (!stack.isEmpty()) count++;
            result[i] = count;
            stack.push(i);
        }
        return result;
    }
}