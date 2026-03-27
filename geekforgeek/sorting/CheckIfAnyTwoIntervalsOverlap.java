import java.util.Scanner;

public class CheckIfAnyTwoIntervalsOverlap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        System.out.print("Enter intervals (start end): ");
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        boolean overlap = false;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intervals[i][0] < intervals[j][1] && intervals[j][0] < intervals[i][1]) {
                    overlap = true;
                    break;
                }
            }
            if (overlap) break;
        }
        System.out.println(overlap ? "Overlap" : "No overlap");
    }
}