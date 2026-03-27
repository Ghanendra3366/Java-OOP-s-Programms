import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class ShortestSafeRoute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter mat[" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        int dist = findShortestPath(mat);
        System.out.println("Shortest Safe Route: " + dist);
    }
    static int findShortestPath(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        int[][] dist = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            if (mat[i][0] == 1) {
                dist[i][0] = 1;
                q.add(new int[]{i, 0});
            }
        }
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int x = curr[0], y = curr[1];
            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];
                if (nx >= 0 && nx < r && ny >= 0 && ny < c && mat[nx][ny] == 1 && dist[nx][ny] > dist[x][y] + 1) {
                    dist[nx][ny] = dist[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
        int minDist = Integer.MAX_VALUE;
        for (int i = 0; i < r; i++) {
            if (dist[i][c - 1] < minDist) minDist = dist[i][c - 1];
        }
        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}