import java.util.Scanner;

public class CheckForSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();
        System.out.println(s.contains(sub) ? "Substring" : "Not substring");
    }
}