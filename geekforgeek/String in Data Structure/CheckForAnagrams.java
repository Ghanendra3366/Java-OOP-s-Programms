import java.util.Scanner;

public class CheckForAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        if (s1.length() != s2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        int[] count = new int[256];
        for (char c : s1.toCharArray()) count[c]++;
        for (char c : s2.toCharArray()) count[c]--;
        boolean anagram = true;
        for (int c : count) if (c != 0) anagram = false;
        System.out.println(anagram ? "Anagrams" : "Not anagrams");
    }
}