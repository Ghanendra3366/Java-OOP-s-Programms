import java.util.Scanner;

public class ComputeTheParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        int parity = 0;
        while (n > 0) {
            parity ^= 1;
            n &= (n - 1);
        }
        System.out.println("Parity: " + parity);
    }
}