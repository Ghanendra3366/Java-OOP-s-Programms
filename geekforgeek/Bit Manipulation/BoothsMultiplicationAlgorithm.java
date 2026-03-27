import java.util.Scanner;

public class BoothsMultiplicationAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter multiplicand: ");
        int m = sc.nextInt();
        System.out.print("Enter multiplier: ");
        int r = sc.nextInt();
        int product = boothMultiply(m, r);
        System.out.println("Product: " + product);
    }
    static int boothMultiply(int m, int r) {
        int A = m, S = -m, P = r;
        int count = Integer.SIZE;
        while (count > 0) {
            if ((P & 1) == 1) {
                P += A;
            } else {
                P += S;
            }
            P >>= 1;
            count--;
        }
        return P;
    }
}