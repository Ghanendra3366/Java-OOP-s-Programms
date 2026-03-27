import java.util.Scanner;

public class CheckIfBinaryIsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = (rev << 1) | (temp & 1);
            temp >>= 1;
        }
        boolean isPal = (rev == n);
        System.out.println("Is palindrome: " + isPal);
    }
}