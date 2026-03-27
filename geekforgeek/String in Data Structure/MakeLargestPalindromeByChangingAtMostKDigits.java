import java.util.Scanner;

public class MakeLargestPalindromeByChangingAtMostKDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        String largest = makeLargestPalindrome(s, k);
        System.out.println("Largest: " + largest);
    }
    static String makeLargestPalindrome(String s, int k) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int changes = 0;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                arr[n - 1 - i] = arr[i];
                changes++;
            }
        }
        if (changes <= k) {
            for (int i = 0; i < n / 2; i++) {
                if (arr[i] != '9') {
                    if (changes < k || (arr[i] == arr[n - 1 - i] && changes + 2 <= k)) {
                        arr[i] = '9';
                        arr[n - 1 - i] = '9';
                        changes += arr[i] == arr[n - 1 - i] ? 2 : 1;
                    }
                }
            }
            if (n % 2 == 1 && changes < k) arr[n / 2] = '9';
        } else {
            return "Not possible";
        }
        return new String(arr);
    }
}