import java.util.Scanner;

public class AddTwoFractions {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1 den1 num2 den2: ");
        int num1 = sc.nextInt(), den1 = sc.nextInt(), num2 = sc.nextInt(), den2 = sc.nextInt();
        int num = num1 * den2 + num2 * den1;
        int den = den1 * den2;
        int g = gcd(num, den);
        num /= g;
        den /= g;
        System.out.println(num + "/" + den);
    }
}