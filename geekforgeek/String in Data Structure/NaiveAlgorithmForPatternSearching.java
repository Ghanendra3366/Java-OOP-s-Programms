import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class NaiveAlgorithmForPatternSearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.print("Enter pattern: ");
        String pattern = sc.nextLine();
        List<Integer> positions = naiveSearch(text, pattern);
        for (int pos : positions) System.out.println("Found at: " + pos);
    }
    static List<Integer> naiveSearch(String text, String pattern) {
        List<Integer> result = new ArrayList<>();
        int n = text.length(), m = pattern.length();
        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) break;
            }
            if (j == m) result.add(i);
        }
        return result;
    }
}