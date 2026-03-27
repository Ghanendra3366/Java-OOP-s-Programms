import java.util.Scanner;

public class KthDigitInAb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a b k: ");
        int a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        long pow = (long) Math.pow(a, b);
        String s = String.valueOf(pow);
        if (k <= s.length()) {
            System.out.println("Kth digit: " + s.charAt(s.length() - k));
        } else {
            System.out.println("Not enough digits");
        }
    }
}