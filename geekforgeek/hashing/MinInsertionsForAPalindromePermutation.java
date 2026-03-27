import java.util.Scanner;
import java.util.HashMap;

public class MinInsertionsForAPalindromePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int odd = 0;
        for (int freq : map.values()) {
            if (freq % 2 == 1) odd++;
        }
        System.out.println("Min insertions: " + (odd > 1 ? odd - 1 : 0));
    }
}