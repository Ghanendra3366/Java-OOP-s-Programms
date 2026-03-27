import java.util.Scanner;
import java.util.Arrays;

public class ClosestPairOfPoints {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    static double dist(Point p1, Point p2) {
        return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of points: ");
        int n = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter x y: ");
            int x = sc.nextInt(), y = sc.nextInt();
            points[i] = new Point(x, y);
        }
        double minDist = Double.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                minDist = Math.min(minDist, dist(points[i], points[j]));
            }
        }
        System.out.println("Closest distance: " + minDist);
    }
}