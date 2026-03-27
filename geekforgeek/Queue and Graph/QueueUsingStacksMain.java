import java.util.Scanner;
import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void enqueue(int x) {
        s1.push(x);
    }

    int dequeue() {
        if (s1.isEmpty() && s2.isEmpty()) return -1;
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.pop();
    }

    int front() {
        if (s1.isEmpty() && s2.isEmpty()) return -1;
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) s2.push(s1.pop());
        }
        return s2.peek();
    }

    boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}

public class QueueUsingStacksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStacks queue = new QueueUsingStacks();
        System.out.print("Enter operations: ");
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            System.out.print("1 enqueue, 2 dequeue, 3 front, 4 isEmpty: ");
            int type = sc.nextInt();
            if (type == 1) {
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                queue.enqueue(val);
            } else if (type == 2) {
                System.out.println("Dequeue: " + queue.dequeue());
            } else if (type == 3) {
                System.out.println("Front: " + queue.front());
            } else {
                System.out.println("IsEmpty: " + queue.isEmpty());
            }
        }
    }
}