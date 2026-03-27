import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class MinimumCostPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();
        int[][] grid = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter grid[" + i + "][" + j + "]: ");
                grid[i][j] = sc.nextInt();
            }
        }
        int cost = minimumCostPath(grid);
        System.out.println("Min Cost: " + cost);
    }
    static int minimumCostPath(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int[][] dist = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[0][0] = grid[0][0];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        pq.add(new int[]{0, 0, grid[0][0]});
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int x = curr[0], y = curr[1], cost = curr[2];
            if (x == r - 1 && y == c - 1) return cost;
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];
                if (nx >= 0 && nx < r && ny >= 0 && ny < c) {
                    int newCost = cost + grid[nx][ny];
                    if (newCost < dist[nx][ny]) {
                        dist[nx][ny] = newCost;
                        pq.add(new int[]{nx, ny, newCost});
                    }
                }
            }
        }
        return -1;
    }
}