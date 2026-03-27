import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int sqrt = (int) Math.sqrt(n);
        System.out.println("Square root: " + sqrt);
    }
}