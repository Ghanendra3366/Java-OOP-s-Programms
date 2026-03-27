import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class AlienDictionary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) words[i] = sc.next();
        String order = alienOrder(words);
        System.out.println("Order: " + order);
    }
    static String alienOrder(String[] words) {
        HashMap<Character, List<Character>> graph = new HashMap<>();
        HashMap<Character, Integer> indegree = new HashMap<>();
        for (String word : words) {
            for (char c : word.toCharArray()) {
                graph.putIfAbsent(c, new ArrayList<>());
                indegree.putIfAbsent(c, 0);
            }
        }
        for (int i = 0; i < words.length - 1; i++) {
            String w1 = words[i], w2 = words[i + 1];
            int len = Math.min(w1.length(), w2.length());
            for (int j = 0; j < len; j++) {
                if (w1.charAt(j) != w2.charAt(j)) {
                    graph.get(w1.charAt(j)).add(w2.charAt(j));
                    indegree.put(w2.charAt(j), indegree.get(w2.charAt(j)) + 1);
                    break;
                }
            }
        }
        Queue<Character> queue = new LinkedList<>();
        for (char c : indegree.keySet()) {
            if (indegree.get(c) == 0) queue.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while (!queue.isEmpty()) {
            char c = queue.poll();
            sb.append(c);
            for (char nei : graph.get(c)) {
                indegree.put(nei, indegree.get(nei) - 1);
                if (indegree.get(nei) == 0) queue.add(nei);
            }
        }
        return sb.length() == indegree.size() ? sb.toString() : "";
    }
}