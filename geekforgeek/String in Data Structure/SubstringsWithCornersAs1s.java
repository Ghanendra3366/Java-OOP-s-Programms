import java.util.Scanner;

public class SubstringsWithCornersAs1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);
                if (sub.charAt(0) == '1' && sub.charAt(sub.length() - 1) == '1') {
                    System.out.println(sub);
                }
            }
        }
    }
}