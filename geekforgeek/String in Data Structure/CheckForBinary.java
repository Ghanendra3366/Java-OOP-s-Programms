import java.util.Scanner;

public class CheckForBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        boolean isBinary = true;
        for (char ch : s.toCharArray()) {
            if (ch != '0' && ch != '1') {
                isBinary = false;
                break;
            }
        }
        System.out.println(isBinary ? "Binary" : "Not binary");
    }
}