import java.util.Scanner;

public class AddBitStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first bit string: ");
        String a = sc.next();
        System.out.print("Enter second bit string: ");
        String b = sc.next();
        String result = addBitStrings(a, b);
        System.out.println("Sum: " + result);
    }
    static String addBitStrings(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }
}