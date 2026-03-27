import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roman: ");
        String s = sc.nextLine();
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = romanValue(s.charAt(i));
            if (i + 1 < s.length() && val < romanValue(s.charAt(i + 1))) {
                result -= val;
            } else {
                result += val;
            }
        }
        System.out.println("Integer: " + result);
    }
    static int romanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}