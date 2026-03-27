import java.util.Scanner;

public class PalindromeSubstringQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter number of queries: ");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter l r: ");
            int l = sc.nextInt(), r = sc.nextInt();
            String sub = s.substring(l, r + 1);
            boolean pal = isPalindrome(sub);
            System.out.println(pal ? "Palindrome" : "Not");
        }
    }
    static boolean isPalindrome(String sub) {
        int i = 0, j = sub.length() - 1;
        while (i < j) {
            if (sub.charAt(i) != sub.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}