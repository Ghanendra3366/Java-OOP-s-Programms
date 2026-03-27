import java.util.Scanner;

public class CheckForEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        boolean equal = (a ^ b) == 0;
        System.out.println("Equal: " + equal);
    }
}