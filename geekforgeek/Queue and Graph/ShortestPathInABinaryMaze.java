import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class ShortestPathInABinaryMaze {
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
        System.out.print("Enter start x: ");
        int sx = sc.nextInt();
        System.out.print("Enter start y: ");
        int sy = sc.nextInt();
        System.out.print("Enter dest x: ");
        int dx = sc.nextInt();
        System.out.print("Enter dest y: ");
        int dy = sc.nextInt();
        int dist = shortestPath(grid, sx, sy, dx, dy);
        System.out.println("Shortest Path: " + dist);
    }
    static int shortestPath(int[][] grid, int sx, int sy, int dx, int dy) {
        int r = grid.length, c = grid[0].length;
        if (grid[sx][sy] == 0 || grid[dx][dy] == 0) return -1;
        boolean[][] visited = new boolean[r][c];
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{sx, sy, 0});
        visited[sx][sy] = true;
        int[] dxs = {-1, 0, 1, 0};
        int[] dys = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0], y = curr[1], dist = curr[2];
            if (x == dx && y == dy) return dist;
            for (int i = 0; i < 4; i++) {
                int nx = x + dxs[i], ny = y + dys[i];
                if (nx >= 0 && nx < r && ny >= 0 && ny < c && grid[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new int[]{nx, ny, dist + 1});
                }
            }
        }
        return -1;
    }
}