import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class AllPossibleWalksWithKEdges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter edges: ");
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            adj.get(u).add(w);
        }
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int walks = countWalks(adj, start, k);
        System.out.println("Walks: " + walks);
    }
    static int countWalks(ArrayList<ArrayList<Integer>> adj, int start, int k) {
        int v = adj.size();
        int[][] dp = new int[v][k + 1];
        dp[start][0] = 1;
        for (int len = 1; len <= k; len++) {
            for (int u = 0; u < v; u++) {
                for (int neighbor : adj.get(u)) {
                    dp[neighbor][len] += dp[u][len - 1];
                }
            }
        }
        int total = 0;
        for (int i = 0; i < v; i++) total += dp[i][k];
        return total;
    }
}