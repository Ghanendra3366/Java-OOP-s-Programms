import java.util.Scanner;

public class CheckForKAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int[] count = new int[256];
        for (char c : s1.toCharArray()) count[c]++;
        for (char c : s2.toCharArray()) count[c]--;
        int diff = 0;
        for (int c : count) if (c != 0) diff++;
        System.out.println(diff <= 2 * k ? "K-anagrams" : "Not k-anagrams");
    }
}