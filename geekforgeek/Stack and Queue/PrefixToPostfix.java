import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prefix: ");
        String prefix = sc.next();
        String postfix = prefixToPostfix(prefix);
        System.out.println("Postfix: " + postfix);
    }
    static String prefixToPostfix(String prefix) {
        Stack<String> stack = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (Character.isLetterOrDigit(c)) stack.push(c + "");
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push(op1 + op2 + c);
            }
        }
        return stack.pop();
    }
}