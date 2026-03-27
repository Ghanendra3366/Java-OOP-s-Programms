import java.util.Scanner;

public class CheckForSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter subsequence: ");
        String sub = sc.nextLine();
        boolean isSub = isSubsequence(s, sub);
        System.out.println(isSub ? "Subsequence" : "Not subsequence");
    }
    static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) j++;
            i++;
        }
        return j == t.length();
    }
}