import java.util.Scanner;
import java.util.HashMap;

public class FourSumFromFourSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[][] arr = new int[4][n];
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter array " + i + ": ");
            for (int j = 0; j < n; j++) arr[i][j] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = arr[0][i] + arr[1][j];
                map.put(sum, new int[]{i, j});
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = arr[2][i] + arr[3][j];
                int needed = target - sum;
                if (map.containsKey(needed)) {
                    int[] pair = map.get(needed);
                    System.out.println("Quadruple: " + arr[0][pair[0]] + " " + arr[1][pair[1]] + " " + arr[2][i] + " " + arr[3][j]);
                    return;
                }
            }
        }
        System.out.println("No quadruple");
    }
}