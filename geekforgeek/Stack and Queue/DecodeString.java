import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter s: ");
        String s = sc.next();
        String decoded = decodeString(s);
        System.out.println("Decoded: " + decoded);
    }
    static String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) num = num * 10 + (c - '0');
            else if (c == '[') {
                numStack.push(num);
                strStack.push(current.toString());
                current = new StringBuilder();
                num = 0;
            } else if (c == ']') {
                int times = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int i = 0; i < times; i++) temp.append(current);
                current = temp;
            } else current.append(c);
        }
        return current.toString();
    }
}