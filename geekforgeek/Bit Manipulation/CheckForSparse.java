import java.util.Scanner;

public class CheckForSparse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        boolean sparse = (n & (n >> 1)) == 0;
        System.out.println("Is sparse: " + sparse);
    }
}