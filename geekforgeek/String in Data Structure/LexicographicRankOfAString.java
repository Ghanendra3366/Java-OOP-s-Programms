import java.util.Scanner;

public class LexicographicRankOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        long rank = findRank(s);
        System.out.println("Rank: " + rank);
    }
    static long findRank(String s) {
        long rank = 1;
        int n = s.length();
        long[] fact = new long[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) fact[i] = fact[i - 1] * i;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) < s.charAt(i)) count++;
            }
            rank += count * fact[n - i - 1];
        }
        return rank;
    }
}