import java.util.Scanner;

public class SuperPrime {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        String s = String.valueOf(n);
        boolean superPrime = true;
        for (int i = 1; i <= s.length(); i++) {
            int prefix = Integer.parseInt(s.substring(0, i));
            if (!isPrime(prefix)) {
                superPrime = false;
                break;
            }
        }
        System.out.println(superPrime ? "Super Prime" : "Not Super Prime");
    }
}