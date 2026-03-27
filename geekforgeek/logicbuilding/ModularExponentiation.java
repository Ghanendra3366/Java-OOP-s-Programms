import java.util.Scanner;

public class ModularExponentiation {
    public static long modPow(long a, long b, long m) {
        long res = 1;
        a %= m;
        while (b > 0) {
            if (b % 2 == 1) res = (res * a) % m;
            a = (a * a) % m;
            b /= 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b m: ");
        long a = sc.nextLong(), b = sc.nextLong(), m = sc.nextLong();
        System.out.println("Result: " + modPow(a, b, m));
    }
}