import java.util.Scanner;

public class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = n * (n + 1) * (2 * n + 1) / 6;
        System.out.println("Sum: " + sum);
    }
}