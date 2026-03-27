import java.util.Scanner;

public class MostSignificantSetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int msb = 0;
        while (n > 0) {
            msb = n;
            n >>= 1;
        }
        System.out.println("MSB: " + msb);
    }
}