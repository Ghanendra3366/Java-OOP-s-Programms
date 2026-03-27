import java.util.Scanner;

class KQueues {
    int[] arr;
    int[] front, rear, next;
    int free;

    KQueues(int k, int n) {
        arr = new int[n];
        front = new int[k];
        rear = new int[k];
        next = new int[n];
        for (int i = 0; i < k; i++) front[i] = rear[i] = -1;
        free = 0;
        for (int i = 0; i < n - 1; i++) next[i] = i + 1;
        next[n - 1] = -1;
    }

    boolean isEmpty(int qn) {
        return front[qn] == -1;
    }

    boolean isFull() {
        return free == -1;
    }

    void enqueue(int item, int qn) {
        if (isFull()) return;
        int i = free;
        free = next[i];
        if (isEmpty(qn)) front[qn] = i;
        else next[rear[qn]] = i;
        next[i] = -1;
        rear[qn] = i;
        arr[i] = item;
    }

    int dequeue(int qn) {
        if (isEmpty(qn)) return -1;
        int i = front[qn];
        front[qn] = next[i];
        next[i] = free;
        free = i;
        return arr[i];
    }
}

public class KQueuesInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        KQueues kq = new KQueues(k, n);
        System.out.print("Enter operations: ");
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            System.out.print("1 enqueue, 2 dequeue: ");
            int type = sc.nextInt();
            System.out.print("Enter qn: ");
            int qn = sc.nextInt();
            if (type == 1) {
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                kq.enqueue(val, qn);
            } else {
                System.out.println("Dequeued: " + kq.dequeue(qn));
            }
        }
    }
}