import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class FirstNonRepeatingInAStream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter stream: ");
        String stream = sc.next();
        firstNonRepeating(stream);
    }
    static void firstNonRepeating(String stream) {
        int[] freq = new int[26];
        Queue<Character> q = new LinkedList<>();
        for (char c : stream.toCharArray()) {
            freq[c - 'a']++;
            q.add(c);
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) q.poll();
            if (q.isEmpty()) System.out.print("# ");
            else System.out.print(q.peek() + " ");
        }
    }
}