import java.util.Scanner;

public class NthCatalanNumber {
    public static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        long catalan = fact(2 * n) / (fact(n + 1) * fact(n));
        System.out.println("Catalan: " + catalan);
    }
}