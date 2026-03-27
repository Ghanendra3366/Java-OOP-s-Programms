import java.util.Scanner;

public class CheckForIntegerOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        if (a > 0 && b > 0 && a > Integer.MAX_VALUE - b) {
            System.out.println("Overflow");
        } else if (a < 0 && b < 0 && a < Integer.MIN_VALUE - b) {
            System.out.println("Underflow");
        } else {
            System.out.println("No overflow: " + (a + b));
        }
    }
}