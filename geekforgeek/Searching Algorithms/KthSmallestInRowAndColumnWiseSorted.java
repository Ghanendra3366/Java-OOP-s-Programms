import java.util.Scanner;
import java.util.PriorityQueue;

public class KthSmallestInRowAndColumnWiseSorted {
    static class Element {
        int val, row, col;
        Element(int v, int r, int c) {
            val = v; row = r; col = c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.print("Enter matrix: ");
        for (int i = 0; i < n; i++) for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        PriorityQueue<Element> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (int i = 0; i < n; i++) {
            pq.add(new Element(mat[i][0], i, 0));
        }
        for (int i = 0; i < k - 1; i++) {
            Element e = pq.poll();
            if (e.col + 1 < n) {
                pq.add(new Element(mat[e.row][e.col + 1], e.row, e.col + 1));
            }
        }
        System.out.println("Kth smallest: " + pq.peek().val);
    }
}