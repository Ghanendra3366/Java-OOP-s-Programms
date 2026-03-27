import java.util.Scanner;

public class CheckForPanagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        boolean[] present = new boolean[26];
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') present[ch - 'a'] = true;
        }
        boolean isPanagram = true;
        for (boolean b : present) if (!b) isPanagram = false;
        System.out.println(isPanagram ? "Panagram" : "Not panagram");
    }
}