import java.util.Scanner;

public class MakeTwoStringsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        int minChanges = minChangesForAnagram(s1, s2);
        System.out.println("Min changes: " + minChanges);
    }
    static int minChangesForAnagram(String s1, String s2) {
        int[] count = new int[256];
        for (char c : s1.toCharArray()) count[c]++;
        for (char c : s2.toCharArray()) count[c]--;
        int changes = 0;
        for (int c : count) changes += Math.abs(c);
        return changes / 2;
    }
}