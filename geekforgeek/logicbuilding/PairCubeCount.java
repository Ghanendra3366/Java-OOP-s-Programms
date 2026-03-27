import java.util.Scanner;

public class PairCubeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int count = 0;
        for (int a = 1; a * a * a < n; a++) {
            for (int b = a; a * a * a + b * b * b <= n; b++) {
                if (a * a * a + b * b * b == n) {
                    count++;
                }
            }
        }
        System.out.println("Number of pairs: " + count);
    }
}