import java.util.Scanner;

public class LengthOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.println("Length: " + s.length());
    }
}