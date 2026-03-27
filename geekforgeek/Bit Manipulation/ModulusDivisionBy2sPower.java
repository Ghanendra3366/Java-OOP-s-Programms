import java.util.Scanner;

public class ModulusDivisionBy2sPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter power of 2 (d): ");
        int d = sc.nextInt();
        int result = n & (d - 1);
        System.out.println("n % " + d + " = " + result);
    }
}