import java.util.Scanner;

public class SquareWithoutUsingMultiplyDivideAndPow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int square = 0;
        for (int i = 0; i < n; i++) {
            square += n;
        }
        System.out.println("Square: " + square);
    }
}