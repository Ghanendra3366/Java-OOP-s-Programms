import java.util.Scanner;

public class AddNBinaryStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        String[] bins = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter binary " + i + ": ");
            bins[i] = sc.next();
        }
        String sum = "0";
        for (String b : bins) {
            sum = addBinary(sum, b);
        }
        System.out.println("Sum: " + sum);
    }
    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}