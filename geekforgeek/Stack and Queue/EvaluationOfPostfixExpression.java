import java.util.Scanner;
import java.util.Stack;

public class EvaluationOfPostfixExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter postfix: ");
        String postfix = sc.next();
        int result = evaluatePostfix(postfix);
        System.out.println("Result: " + result);
    }
    static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isDigit(c)) stack.push(c - '0');
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+': stack.push(val2 + val1); break;
                    case '-': stack.push(val2 - val1); break;
                    case '*': stack.push(val2 * val1); break;
                    case '/': stack.push(val2 / val1); break;
                }
            }
        }
        return stack.pop();
    }
}