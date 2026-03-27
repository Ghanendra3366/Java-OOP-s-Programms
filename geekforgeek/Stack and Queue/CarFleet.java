import java.util.Scanner;
import java.util.Stack;

public class CarFleet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] position = new int[n];
        int[] speed = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter position[" + i + "]: ");
            position[i] = sc.nextInt();
            System.out.print("Enter speed[" + i + "]: ");
            speed[i] = sc.nextInt();
        }
        int fleets = carFleet(target, position, speed);
        System.out.println("Fleets: " + fleets);
    }
    static int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        java.util.Arrays.sort(cars, (a, b) -> b[0] - a[0]);
        Stack<Double> stack = new Stack<>();
        for (int[] car : cars) {
            double time = (double) (target - car[0]) / car[1];
            while (!stack.isEmpty() && time >= stack.peek()) stack.pop();
            stack.push(time);
        }
        return stack.size();
    }
}