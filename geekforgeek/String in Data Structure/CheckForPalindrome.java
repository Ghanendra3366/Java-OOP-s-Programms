import java.util.Scanner;

public class CheckForPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int i = 0, j = s.length() - 1;
        boolean isPal = true;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                isPal = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(isPal ? "Palindrome" : "Not palindrome");
    }
}