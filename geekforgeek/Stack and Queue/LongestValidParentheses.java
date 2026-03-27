import java.util.Scanner;
import java.util.Stack;

public class LongestValidParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();
        int length = longestValidParentheses(s);
        System.out.println("Length: " + length);
    }
    static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') stack.push(i);
            else {
                stack.pop();
                if (stack.isEmpty()) stack.push(i);
                else maxLen = Math.max(maxLen, i - stack.peek());
            }
        }
        return maxLen;
    }
}