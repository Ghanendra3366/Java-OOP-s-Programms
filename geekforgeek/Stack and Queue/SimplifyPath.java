import java.util.Scanner;
import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path: ");
        String path = sc.next();
        String simplified = simplifyPath(path);
        System.out.println("Simplified: " + simplified);
    }
    static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        for (String part : parts) {
            if (part.equals("..")) {
                if (!stack.isEmpty()) stack.pop();
            } else if (!part.equals("") && !part.equals(".")) {
                stack.push(part);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) sb.append("/").append(dir);
        return sb.length() == 0 ? "/" : sb.toString();
    }
}