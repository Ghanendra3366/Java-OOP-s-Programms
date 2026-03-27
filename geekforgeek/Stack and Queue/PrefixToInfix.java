import java.util.Scanner;
import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter prefix: ");
        String prefix = sc.next();
        String infix = prefixToInfix(prefix);
        System.out.println("Infix: " + infix);
    }
    static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            if (Character.isLetterOrDigit(c)) stack.push(c + "");
            else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push("(" + op1 + c + op2 + ")");
            }
        }
        return stack.pop();
    }
}