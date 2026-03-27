import java.util.Scanner;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] asteroids = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter asteroids[" + i + "]: ");
            asteroids[i] = sc.nextInt();
        }
        int[] result = asteroidCollision(asteroids);
        for (int i : result) System.out.print(i + " ");
    }
    static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int ast : asteroids) {
            boolean destroyed = false;
            while (!stack.isEmpty() && stack.peek() > 0 && ast < 0) {
                if (stack.peek() < -ast) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -ast) {
                    stack.pop();
                    destroyed = true;
                    break;
                } else {
                    destroyed = true;
                    break;
                }
            }
            if (!destroyed) stack.push(ast);
        }
        int[] result = new int[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) result[i] = stack.pop();
        return result;
    }
}