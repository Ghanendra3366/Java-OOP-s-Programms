import java.util.Scanner;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        int q = n / m;
        int n1 = m * q;
        int n2 = (n * m > 0) ? m * (q + 1) : m * (q - 1);
        if (Math.abs(n - n1) < Math.abs(n - n2)) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}