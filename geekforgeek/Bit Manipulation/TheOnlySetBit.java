import java.util.Scanner;

public class TheOnlySetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if ((n & (n - 1)) == 0 && n != 0) {
            int pos = 0;
            while (n > 1) {
                n >>= 1;
                pos++;
            }
            System.out.println("Only set bit at position: " + (pos + 1));
        } else {
            System.out.println("Not a number with only one set bit");
        }
    }
}