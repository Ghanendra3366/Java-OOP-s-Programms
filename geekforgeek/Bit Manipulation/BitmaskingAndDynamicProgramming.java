import java.util.Scanner;

public class BitmaskingAndDynamicProgramming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] dp = new int[1 << n];
        // Example: subset sum or something, but simplified
        System.out.println("DP array size: " + dp.length);
    }
}