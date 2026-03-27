import java.util.Scanner;

public class WordSearch8DirectionsAndStraightMovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows cols: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        char[][] grid = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = sc.next().charAt(0);
            }
        }
        System.out.print("Enter word: ");
        String word = sc.next();
        boolean found = exist(grid, word);
        System.out.println(found ? "Found" : "Not found");
    }
    static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }
    static boolean dfs(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) return false;
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = dfs(board, word, i + 1, j, index + 1) || dfs(board, word, i - 1, j, index + 1) ||
                         dfs(board, word, i, j + 1, index + 1) || dfs(board, word, i, j - 1, index + 1) ||
                         dfs(board, word, i + 1, j + 1, index + 1) || dfs(board, word, i + 1, j - 1, index + 1) ||
                         dfs(board, word, i - 1, j + 1, index + 1) || dfs(board, word, i - 1, j - 1, index + 1);
        board[i][j] = temp;
        return found;
    }
}