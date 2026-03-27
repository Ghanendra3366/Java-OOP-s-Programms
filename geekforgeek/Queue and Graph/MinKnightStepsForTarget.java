import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class MinKnightStepsForTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target x: ");
        int x = sc.nextInt();
        System.out.print("Enter target y: ");
        int y = sc.nextInt();
        int steps = minKnightMoves(x, y);
        System.out.println("Min Steps: " + steps);
    }
    static int minKnightMoves(int x, int y) {
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[605][605];
        q.add(new int[]{0, 0, 0});
        visited[302][302] = true;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int cx = curr[0], cy = curr[1], steps = curr[2];
            if (cx == x && cy == y) return steps;
            for (int i = 0; i < 8; i++) {
                int nx = cx + dx[i], ny = cy + dy[i];
                if (!visited[nx + 302][ny + 302]) {
                    visited[nx + 302][ny + 302] = true;
                    q.add(new int[]{nx, ny, steps + 1});
                }
            }
        }
        return -1;
    }
}