import java.util.Scanner;

public class EuclidWhenPercentAndDivideAreCostly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println("GCD: " + gcd);
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            if (a > b) a -= b;
            else b -= a;
        }
        return a;
    }
}