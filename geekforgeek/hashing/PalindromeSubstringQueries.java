import java.util.Scanner;
import java.util.HashMap;

public class PalindromeSubstringQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        int n = s.length();
        HashMap<String, Boolean> map = new HashMap<>();
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter l r: ");
            int l = sc.nextInt(), r = sc.nextInt();
            String sub = s.substring(l, r + 1);
            String key = l + "," + r;
            if (!map.containsKey(key)) {
                map.put(key, isPalindrome(sub));
            }
            System.out.println(map.get(key) ? "Palindrome" : "Not palindrome");
        }
    }
    static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}