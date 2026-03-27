import java.util.Scanner;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter char: ");
        char c = sc.next().charAt(0);
        String result = s.replace(String.valueOf(c), "");
        System.out.println("Result: " + result);
    }
}