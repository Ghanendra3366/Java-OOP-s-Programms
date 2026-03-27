import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class GenerateBinaryFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        generateBinary(n);
    }
    static void generateBinary(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");
        int count = 1;
        while (count <= n) {
            String curr = q.poll();
            System.out.print(curr + " ");
            if (count < n) q.add(curr + "0");
            if (count < n) q.add(curr + "1");
            count++;
        }
    }
}