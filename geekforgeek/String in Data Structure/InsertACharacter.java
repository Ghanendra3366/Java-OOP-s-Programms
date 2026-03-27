import java.util.Scanner;

public class InsertACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter char: ");
        char c = sc.next().charAt(0);
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        String result = s.substring(0, pos) + c + s.substring(pos);
        System.out.println("Result: " + result);
    }
}