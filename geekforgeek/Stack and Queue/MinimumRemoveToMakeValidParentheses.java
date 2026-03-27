import java.util.Scanner;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();
        String result = minRemoveToMakeValid(s);
        System.out.println("Result: " + result);
    }
    static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else if (s.charAt(i) == ')') {
                if (!stack.isEmpty() && s.charAt(stack.peek()) == '(') stack.pop();
                else stack.push(i);
            }
        }
        StringBuilder sb = new StringBuilder(s);
        while (!stack.isEmpty()) sb.deleteCharAt(stack.pop());
        return sb.toString();
    }
}