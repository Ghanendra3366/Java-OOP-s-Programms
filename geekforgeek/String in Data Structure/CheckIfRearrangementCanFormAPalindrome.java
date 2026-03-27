import java.util.Scanner;

public class CheckIfRearrangementCanFormAPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        int[] count = new int[256];
        for (char c : s.toCharArray()) count[c]++;
        int odd = 0;
        for (int c : count) if (c % 2 == 1) odd++;
        System.out.println(odd <= 1 ? "Can form palindrome" : "Cannot");
    }
}