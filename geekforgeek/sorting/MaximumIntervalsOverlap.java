import java.util.Scanner;
import java.util.Arrays;

public class MaximumIntervalsOverlap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.print("Enter intervals: ");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        int[] starts = new int[n];
        int[] ends = new int[n];
        for (int i = 0; i < n; i++) {
            starts[i] = intervals[i][0];
            ends[i] = intervals[i][1];
        }
        Arrays.sort(starts);
        Arrays.sort(ends);
        int i = 0, j = 0, current = 0, max = 0;
        while (i < n && j < n) {
            if (starts[i] < ends[j]) {
                current++;
                max = Math.max(max, current);
                i++;
            } else {
                current--;
                j++;
            }
        }
        System.out.println("Max overlap: " + max);
    }
}