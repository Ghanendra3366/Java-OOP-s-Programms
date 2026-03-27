import java.util.Scanner;

public class RotateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter positions: ");
        int d = sc.nextInt();
        int bits = 32;
        d %= bits;
        int left = (n << d) | (n >> (bits - d));
        int right = (n >> d) | (n << (bits - d));
        System.out.println("Left rotate: " + left);
        System.out.println("Right rotate: " + right);
    }
}