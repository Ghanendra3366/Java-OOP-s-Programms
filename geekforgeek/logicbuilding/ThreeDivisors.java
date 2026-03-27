import java.util.Scanner;

public class ThreeDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) count++;
        }
        if (count == 3) {
            System.out.println("Has exactly 3 divisors");
        } else {
            System.out.println("Does not");
        }
    }
}