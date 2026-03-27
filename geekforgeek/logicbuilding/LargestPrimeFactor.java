import java.util.Scanner;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = sc.nextLong();
        long max = -1;
        while (n % 2 == 0) {
            max = 2;
            n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                max = i;
                n /= i;
            }
        }
        if (n > 2) max = n;
        System.out.println("Largest prime factor: " + max);
    }
}