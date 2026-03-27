import java.util.Scanner;

public class RegularExpressionMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter pattern: ");
        String p = sc.nextLine();
        boolean match = s.matches(p);
        System.out.println(match ? "Match" : "No match");
    }
}