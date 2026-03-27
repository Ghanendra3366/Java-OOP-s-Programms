import java.util.Scanner;

public class SetTheKthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int result = n | (1 << (k - 1));
        System.out.println("After setting k-th bit: " + result);
    }
}