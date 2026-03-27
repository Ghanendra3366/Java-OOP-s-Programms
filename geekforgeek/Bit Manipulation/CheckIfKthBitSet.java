import java.util.Scanner;

public class CheckIfKthBitSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        boolean isSet = (n & (1 << (k - 1))) != 0;
        System.out.println("K-th bit is " + (isSet ? "set" : "not set"));
    }
}