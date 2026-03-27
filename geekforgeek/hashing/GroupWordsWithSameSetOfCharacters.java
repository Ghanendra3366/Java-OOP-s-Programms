import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GroupWordsWithSameSetOfCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.print("Enter words: ");
        for (int i = 0; i < n; i++) words[i] = sc.next();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String word : words) {
            char[] arr = word.toCharArray();
            java.util.Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        System.out.println("Groups: " + map.values());
    }
}