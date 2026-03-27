import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MaximumCostPath {
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
            graph[w][u] = cost;
        }
        System.out.print("Enter start: ");
        int start = sc.nextInt();
        int maxCost = maximumCostPath(graph, start);
        System.out.println("Max Cost: " + maxCost);
    }
    static int maximumCostPath(int[][] graph, int start) {
        int v = graph.length;
        int[] dist = new int[v];
        for (int i = 0; i < v; i++) dist[i] = Integer.MIN_VALUE;
        dist[start] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        pq.add(new int[]{start, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0], cost = curr[1];
            for (int neighbor = 0; neighbor < v; neighbor++) {
                if (graph[u][neighbor] != 0) {
                    int newCost = cost + graph[u][neighbor];
                    if (newCost > dist[neighbor]) {
                        dist[neighbor] = newCost;
                        pq.add(new int[]{neighbor, newCost});
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int d : dist) max = Math.max(max, d);
        return max;
    }
}