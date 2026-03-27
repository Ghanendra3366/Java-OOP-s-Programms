import java.util.Scanner;

public class CheckForBleak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean bleak = true;
        for (int i = 1; i < n; i++) {
            if (i + Integer.bitCount(i) == n) {
                bleak = false;
                break;
            }
        }
        System.out.println("Is bleak: " + bleak);
    }
}