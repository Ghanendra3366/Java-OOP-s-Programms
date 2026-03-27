import java.util.Scanner;

public class BinomialCoefficient {
    public static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n r: ");
        int n = sc.nextInt(), r = sc.nextInt();
        long ncr = fact(n) / (fact(r) * fact(n - r));
        System.out.println("Binomial Coefficient: " + ncr);
    }
}