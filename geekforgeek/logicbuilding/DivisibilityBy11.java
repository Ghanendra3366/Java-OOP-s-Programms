import java.util.Scanner;

public class DivisibilityBy11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String s = sc.next();
        int sumOdd = 0, sumEven = 0;
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (i % 2 == 0) sumEven += digit;
            else sumOdd += digit;
        }
        int diff = Math.abs(sumEven - sumOdd);
        if (diff % 11 == 0) {
            System.out.println("Divisible by 11");
        } else {
            System.out.println("Not divisible by 11");
        }
    }
}