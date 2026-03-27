import java.util.Scanner;

public class ProgramToFindParity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int parity = 0;
        while (n > 0) {
            parity ^= (n & 1);
            n >>= 1;
        }
        System.out.println("Parity: " + (parity == 0 ? "even" : "odd"));
    }
}