import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class AllSubsequencesOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        List<String> subs = new ArrayList<>();
        generateSubsequences(s, 0, "", subs);
        for (String sub : subs) System.out.println(sub);
    }
    static void generateSubsequences(String s, int index, String current, List<String> subs) {
        if (index == s.length()) {
            subs.add(current);
            return;
        }
        generateSubsequences(s, index + 1, current, subs);
        generateSubsequences(s, index + 1, current + s.charAt(index), subs);
    }
}