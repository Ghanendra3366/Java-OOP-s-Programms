import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        System.out.println("Reversed: " + sb.reverse());
    }
}