import java.util.Scanner;

public class DigitRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Digital root: 0");
        } else {
            int root = n % 9;
            if (root == 0) root = 9;
            System.out.println("Digital root: " + root);
        }
    }
}