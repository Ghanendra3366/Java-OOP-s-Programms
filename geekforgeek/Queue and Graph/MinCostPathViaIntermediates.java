import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MinCostPathViaIntermediates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter edges: ");
        int e = sc.nextInt();
        int[][] graph = new int[v][v];
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            int cost = sc.nextInt();
            graph[u][w] = cost;
        }
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        System.out.print("Enter end: ");
        int end = sc.nextInt();
        System.out.print("Enter intermediates: ");
        int m = sc.nextInt();
        int[] intermediates = new int[m];
        for (int i = 0; i < m; i++) intermediates[i] = sc.nextInt();
        int cost = minCostPath(graph, start, end, intermediates);
        System.out.println("Min Cost: " + cost);
    }
    static int minCostPath(int[][] graph, int start, int end, int[] intermediates) {
        int v = graph.length;
        int[] dist = new int[v];
        for (int i = 0; i < v; i++) dist[i] = Integer.MAX_VALUE;
        dist[start] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{start, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0], cost = curr[1];
            if (u == end) return cost;
            for (int neighbor = 0; neighbor < v; neighbor++) {
                if (graph[u][neighbor] != 0) {
                    int newCost = cost + graph[u][neighbor];
                    if (newCost < dist[neighbor]) {
                        dist[neighbor] = newCost;
                        pq.add(new int[]{neighbor, newCost});
                    }
                }
            }
        }
        return -1;
    }
}