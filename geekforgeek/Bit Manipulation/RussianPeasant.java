import java.util.Scanner;

public class RussianPeasant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int res = 0;
        while (b > 0) {
            if ((b & 1) == 1) res += a;
            a <<= 1;
            b >>= 1;
        }
        System.out.println("Product: " + res);
    }
}