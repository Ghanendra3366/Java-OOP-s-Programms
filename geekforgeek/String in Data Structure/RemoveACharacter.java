import java.util.Scanner;

public class RemoveACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter position: ");
        int pos = sc.nextInt();
        String result = s.substring(0, pos) + s.substring(pos + 1);
        System.out.println("Result: " + result);
    }
}