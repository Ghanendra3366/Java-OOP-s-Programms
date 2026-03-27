import java.util.Scanner;

public class MinimumWithoutBranching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int min = b ^ ((a ^ b) & -(a < b ? 1 : 0));
        System.out.println("Minimum: " + min);
    }
}