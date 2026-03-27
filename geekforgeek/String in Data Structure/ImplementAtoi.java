import java.util.Scanner;

public class ImplementAtoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int result = 0;
        int sign = 1;
        int i = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            i = 1;
        }
        for (; i < s.length(); i++) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                result = result * 10 + (s.charAt(i) - '0');
            } else {
                break;
            }
        }
        System.out.println("Integer: " + (result * sign));
    }
}