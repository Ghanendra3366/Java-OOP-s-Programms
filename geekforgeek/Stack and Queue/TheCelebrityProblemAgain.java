import java.util.Scanner;
import java.util.Stack;

public class TheCelebrityProblemAgain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter mat[" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        int celebrity = findCelebrity(mat, n);
        System.out.println("Celebrity: " + celebrity);
    }
    static int findCelebrity(int[][] mat, int n) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) stack.push(i);
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if (mat[a][b] == 1) stack.push(b);
            else stack.push(a);
        }
        int candidate = stack.pop();
        for (int i = 0; i < n; i++) {
            if (i != candidate && (mat[candidate][i] == 1 || mat[i][candidate] == 0)) return -1;
        }
        return candidate;
    }
}