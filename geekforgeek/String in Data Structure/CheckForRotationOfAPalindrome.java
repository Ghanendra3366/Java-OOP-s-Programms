import java.util.Scanner;

public class CheckForRotationOfAPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        boolean isRotationPal = false;
        for (int i = 0; i < s.length(); i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            if (isPalindrome(rotated)) {
                isRotationPal = true;
                break;
            }
        }
        System.out.println(isRotationPal ? "Rotation palindrome" : "Not");
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