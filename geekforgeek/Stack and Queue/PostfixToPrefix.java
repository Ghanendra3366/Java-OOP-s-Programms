import java.util.Scanner;
import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix: ");
        String postfix = sc.next();
        String prefix = postfixToPrefix(postfix);
        System.out.println("Prefix: " + prefix);
    }
    static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) stack.push(c + "");
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push(c + op2 + op1);
            }
        }
        return stack.pop();
    }
}