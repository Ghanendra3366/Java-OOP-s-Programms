import java.util.Scanner;
import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix: ");
        String infix = sc.next();
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix: " + postfix);
    }
    static String infixToPostfix(String infix) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (char c : infix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) result.append(c);
            else if (c == '(') stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') result.append(stack.pop());
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) result.append(stack.pop());
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) result.append(stack.pop());
        return result.toString();
    }
    static int precedence(char c) {
        switch (c) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
        }
        return -1;
    }
}