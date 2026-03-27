import java.util.Scanner;
import java.util.Stack;

public class ReverseAStackUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            stack.push(sc.nextInt());
        }
        reverseStack(stack);
        System.out.println("Reversed stack: " + stack);
    }
    static void reverseStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            reverseStack(stack);
            insertAtBottom(stack, temp);
        }
    }
    static void insertAtBottom(Stack<Integer> stack, int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, temp);
        stack.push(item);
    }
}