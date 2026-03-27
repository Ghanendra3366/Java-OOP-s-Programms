import java.util.Scanner;

public class SwapBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter i: ");
        int i = sc.nextInt();
        System.out.print("Enter j: ");
        int j = sc.nextInt();
        int bitI = (n >> i) & 1;
        int bitJ = (n >> j) & 1;
        if (bitI != bitJ) {
            n ^= (1 << i);
            n ^= (1 << j);
        }
        System.out.println("After swap: " + n);
    }
}