import java.util.Scanner;

public class CheckForRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("Not rotation");
            return;
        }
        String doubled = s1 + s1;
        System.out.println(doubled.contains(s2) ? "Rotation" : "Not rotation");
    }
}