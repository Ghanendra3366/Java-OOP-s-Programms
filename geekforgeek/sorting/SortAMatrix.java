import java.util.Scanner;
import java.util.Arrays;

public class SortAMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] mat = new int[r][c];
        System.out.print("Enter matrix: ");
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) mat[i][j] = sc.nextInt();
        int[] arr = new int[r * c];
        int k = 0;
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) arr[k++] = mat[i][j];
        Arrays.sort(arr);
        k = 0;
        for (int i = 0; i < r; i++) for (int j = 0; j < c; j++) mat[i][j] = arr[k++];
        System.out.println("Sorted matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}