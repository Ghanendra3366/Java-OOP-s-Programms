import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class BFSForAGraph {
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
            adj.get(w).add(u);
        }
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        bfs(adj, start, v);
    }
    static void bfs(ArrayList<ArrayList<Integer>> adj, int s, int v) {
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.add(s);
        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");
            for (int neighbor : adj.get(u)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }
}