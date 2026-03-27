import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseAQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            queue.add(sc.nextInt());
        }
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
    static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) stack.push(q.poll());
        while (!stack.isEmpty()) q.add(stack.pop());
    }
}