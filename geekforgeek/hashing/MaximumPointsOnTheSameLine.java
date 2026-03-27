import java.util.Scanner;
import java.util.HashMap;

public class MaximumPointsOnTheSameLine {
    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
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
        int maxPoints = 0;
        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();
            int same = 1;
            for (int j = i + 1; j < n; j++) {
                if (points[i].x == points[j].x && points[i].y == points[j].y) {
                    same++;
                } else {
                    int dx = points[j].x - points[i].x;
                    int dy = points[j].y - points[i].y;
                    int gcd = gcd(dx, dy);
                    String slope = (dx / gcd) + "," + (dy / gcd);
                    map.put(slope, map.getOrDefault(slope, 0) + 1);
                }
            }
            maxPoints = Math.max(maxPoints, same);
            for (int val : map.values()) {
                maxPoints = Math.max(maxPoints, val + same);
            }
        }
        System.out.println("Max points: " + maxPoints);
    }
    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}