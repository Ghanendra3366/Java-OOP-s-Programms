import java.util.Scanner;

public class NthNumberWhoseBinaryIsAPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int count = 0, num = 0;
        while (count < n) {
            num++;
            if (isBinaryPalindrome(num)) count++;
        }
        System.out.println("Nth number: " + num);
    }
    static boolean isBinaryPalindrome(int n) {
        int rev = 0, temp = n;
        while (temp > 0) {
            rev = (rev << 1) | (temp & 1);
            temp >>= 1;
        }
        return rev == n;
    }
}