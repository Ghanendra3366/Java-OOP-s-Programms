import java.util.Scanner;

public class SmallestPowerOf2GreaterThanOrEqualToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("1");
            return;
        }
        n--;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        n |= n >> 16;
        n++;
        System.out.println("Smallest power: " + n);
    }
}