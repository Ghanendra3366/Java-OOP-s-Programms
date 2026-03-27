import java.util.Scanner;

public class CheckForOppositeSigns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        boolean opposite = ((a ^ b) < 0);
        System.out.println("Opposite signs: " + opposite);
    }
}