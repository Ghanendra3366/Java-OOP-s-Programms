import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseFirstKOfQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            queue.add(sc.nextInt());
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        reverseFirstK(queue, k);
        System.out.println("Queue: " + queue);
    }
    static void reverseFirstK(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) stack.push(queue.poll());
        while (!stack.isEmpty()) queue.add(stack.pop());
        for (int i = 0; i < queue.size() - k; i++) queue.add(queue.poll());
    }
}