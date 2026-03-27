import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) q2.add(q1.poll());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    int pop() {
        if (q1.isEmpty()) return -1;
        return q1.poll();
    }

    int top() {
        if (q1.isEmpty()) return -1;
        return q1.peek();
    }

    boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueuesMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingQueues stack = new StackUsingQueues();
        System.out.print("Enter operations: ");
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            System.out.print("1 push, 2 pop, 3 top, 4 isEmpty: ");
            int type = sc.nextInt();
            if (type == 1) {
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                stack.push(val);
            } else if (type == 2) {
                System.out.println("Pop: " + stack.pop());
            } else if (type == 3) {
                System.out.println("Top: " + stack.top());
            } else {
                System.out.println("IsEmpty: " + stack.isEmpty());
            }
        }
    }
}