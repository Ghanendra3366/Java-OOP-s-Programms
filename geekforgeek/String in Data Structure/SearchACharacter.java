import java.util.Scanner;

public class SearchACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter char: ");
        char c = sc.next().charAt(0);
        int index = s.indexOf(c);
        System.out.println(index != -1 ? "Found at " + index : "Not found");
    }
}