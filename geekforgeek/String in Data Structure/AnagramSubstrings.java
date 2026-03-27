import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AnagramSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter pattern: ");
        String p = sc.nextLine();
        List<String> anagrams = findAnagramSubstrings(s, p);
        for (String a : anagrams) System.out.println(a);
    }
    static List<String> findAnagramSubstrings(String s, String p) {
        List<String> result = new ArrayList<>();
        int[] pCount = new int[256];
        for (char c : p.toCharArray()) pCount[c]++;
        int[] sCount = new int[256];
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            sCount[s.charAt(right)]++;
            if (right - left + 1 == p.length()) {
                if (java.util.Arrays.equals(pCount, sCount)) {
                    result.add(s.substring(left, right + 1));
                }
                sCount[s.charAt(left)]--;
                left++;
            }
        }
        return result;
    }
}