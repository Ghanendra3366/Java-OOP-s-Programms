import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class WordBreakProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        System.out.print("Enter dictionary size: ");
        int dictSize = sc.nextInt();
        Set<String> dict = new HashSet<>();
        for (int i = 0; i < dictSize; i++) {
            dict.add(sc.next());
        }
        boolean canBreak = wordBreak(s, dict);
        System.out.println(canBreak ? "Can break" : "Cannot break");
    }
    static boolean wordBreak(String s, Set<String> dict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}