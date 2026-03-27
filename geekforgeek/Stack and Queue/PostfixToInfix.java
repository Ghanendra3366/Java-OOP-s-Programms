import java.util.Scanner;
import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix: ");
        String postfix = sc.next();
        String infix = postfixToInfix(postfix);
        System.out.println("Infix: " + infix);
    }
    static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isLetterOrDigit(c)) stack.push(c + "");
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + op2 + c + op1 + ")");
            }
        }
        return stack.pop();
    }
}