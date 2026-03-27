import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter infix: ");
        String infix = sc.next();
        String prefix = infixToPrefix(infix);
        System.out.println("Prefix: " + prefix);
    }
    static String infixToPrefix(String infix) {
        String reversed = new StringBuilder(infix).reverse().toString();
        for (int i = 0; i < reversed.length(); i++) {
            if (reversed.charAt(i) == '(') reversed = reversed.substring(0, i) + ')' + reversed.substring(i + 1);
            else if (reversed.charAt(i) == ')') reversed = reversed.substring(0, i) + '(' + reversed.substring(i + 1);
        }
        String postfix = infixToPostfix(reversed);
        return new StringBuilder(postfix).reverse().toString();
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