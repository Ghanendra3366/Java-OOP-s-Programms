import java.util.Scanner;

public class KaratsubaAlgorithmForFastMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        String x = sc.next();
        System.out.print("Enter y: ");
        String y = sc.next();
        String result = karatsuba(x, y);
        System.out.println("Product: " + result);
    }
    static String karatsuba(String x, String y) {
        int n = Math.max(x.length(), y.length());
        x = String.format("%" + n + "s", x).replace(' ', '0');
        y = String.format("%" + n + "s", y).replace(' ', '0');
        if (n == 1) {
            int prod = (x.charAt(0) - '0') * (y.charAt(0) - '0');
            return String.valueOf(prod);
        }
        int m = n / 2;
        String x1 = x.substring(0, m);
        String x0 = x.substring(m);
        String y1 = y.substring(0, m);
        String y0 = y.substring(m);
        String z2 = karatsuba(x1, y1);
        String z0 = karatsuba(x0, y0);
        String z1 = subtract(multiply(add(x1, x0), add(y1, y0)), add(z2, z0));
        return add(add(shift(z2, 2 * m), shift(z1, m)), z0);
    }
    static String add(String a, String b) {
        // Simplified addition
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
    static String subtract(String a, String b) {
        return String.valueOf(Integer.parseInt(a) - Integer.parseInt(b));
    }
    static String multiply(String a, String b) {
        return String.valueOf(Integer.parseInt(a) * Integer.parseInt(b));
    }
    static String shift(String s, int n) {
        return s + "0".repeat(n);
    }
}