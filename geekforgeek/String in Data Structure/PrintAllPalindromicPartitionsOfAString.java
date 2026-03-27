import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PrintAllPalindromicPartitionsOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();
        List<List<String>> partitions = palindromicPartitions(s);
        for (List<String> part : partitions) {
            System.out.println(part);
        }
    }
    static List<List<String>> palindromicPartitions(String s) {
        List<List<String>> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }
    static void backtrack(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int end = start; end < s.length(); end++) {
            if (isPalindrome(s.substring(start, end + 1))) {
                current.add(s.substring(start, end + 1));
                backtrack(s, end + 1, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
    static boolean isPalindrome(String sub) {
        int i = 0, j = sub.length() - 1;
        while (i < j) {
            if (sub.charAt(i) != sub.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }
}