import java.util.Scanner;

public class URLifyAGivenString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        String result = s.replaceAll(" ", "%20");
        System.out.println("URLified: " + result);
    }
}