import java.util.Scanner;
import java.util.HashMap;

public class SubmatrixWithCornersAs1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.print("Enter matrix: ");
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) mat[i][j] = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < r - 1; i++) {
            for (int j = 0; j < c - 1; j++) {
                if (mat[i][j] == 1 && mat[i][j + 1] == 1 && mat[i + 1][j] == 1 && mat[i + 1][j + 1] == 1) {
                    String key = i + "," + j;
                    map.put(key, map.getOrDefault(key, 0) + 1);
                }
            }
        }
        System.out.println("Submatrices count: " + map.size());
    }
}