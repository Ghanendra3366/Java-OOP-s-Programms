import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] board = new int[101];
        for (int i = 0; i < n; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            board[u] = v;
        }
        int moves = snakesAndLadders(board);
        System.out.println("Min Moves: " + moves);
    }
    static int snakesAndLadders(int[] board) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[101];
        q.add(1);
        visited[1] = true;
        int moves = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int curr = q.poll();
                if (curr == 100) return moves;
                for (int j = 1; j <= 6; j++) {
                    int next = curr + j;
                    if (next > 100) continue;
                    if (board[next] != 0) next = board[next];
                    if (!visited[next]) {
                        visited[next] = true;
                        q.add(next);
                    }
                }
            }
            moves++;
        }
        return -1;
    }
}