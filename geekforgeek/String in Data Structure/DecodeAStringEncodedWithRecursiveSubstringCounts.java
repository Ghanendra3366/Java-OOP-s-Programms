import java.util.Scanner;
import java.util.Stack;

public class DecodeAStringEncodedWithRecursiveSubstringCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter encoded string: ");
        String s = sc.nextLine();
        String decoded = decodeString(s);
        System.out.println("Decoded: " + decoded);
    }
    static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String current = "";
        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            } else if (s.charAt(index) == '[') {
                stringStack.push(current);
                current = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder sb = new StringBuilder(stringStack.pop());
                int count = countStack.pop();
                for (int i = 0; i < count; i++) {
                    sb.append(current);
                }
                current = sb.toString();
                index++;
            } else {
                current += s.charAt(index);
                index++;
            }
        }
        return current;
    }
}