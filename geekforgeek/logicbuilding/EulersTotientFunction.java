import java.util.Scanner;

public class EulersTotientFunction {
    public static int phi(int n) {
        int res = n;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                res -= res / i;
                while (n % i == 0) n /= i;
            }
        }
        if (n > 1) res -= res / n;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Phi: " + phi(n));
    }
}