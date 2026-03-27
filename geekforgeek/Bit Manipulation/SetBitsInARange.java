import java.util.Scanner;

public class SetBitsInARange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter l: ");
        int l = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int mask = ((1 << (r - l + 1)) - 1) << (l - 1);
        int result = n | mask;
        System.out.println("After setting bits: " + result);
    }
}