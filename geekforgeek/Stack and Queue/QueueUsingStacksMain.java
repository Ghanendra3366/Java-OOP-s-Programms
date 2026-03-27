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
}

public class QueueUsingStacksMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueUsingStacks q = new QueueUsingStacks();
        System.out.print("Enter operations: ");
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            System.out.print("1 enqueue, 2 dequeue: ");
            int type = sc.nextInt();
            if (type == 1) {
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                q.enqueue(val);
            } else {
                System.out.println("Dequeued: " + q.dequeue());
            }
        }
    }
}