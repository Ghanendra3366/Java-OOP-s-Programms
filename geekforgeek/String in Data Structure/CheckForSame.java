import java.util.Scanner;

public class CheckForSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println(s1.equals(s2) ? "Same" : "Not same");
    }
}