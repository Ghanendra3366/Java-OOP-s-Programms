import java.util.Scanner;

public class DivisibilityBy13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        long n = sc.nextLong();
        if (n % 13 == 0) {
            System.out.println("Divisible by 13");
        } else {
            System.out.println("Not");
        }
    }
}