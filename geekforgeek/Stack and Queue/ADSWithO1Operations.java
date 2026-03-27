import java.util.Scanner;

class DS {
    int[] arr;
    int front, rear, size, capacity;

    DS(int cap) {
        capacity = cap;
        arr = new int[cap];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int x) {
        if (size == capacity) return;
        rear = (rear + 1) % capacity;
        arr[rear] = x;
        size++;
    }

    int dequeue() {
        if (size == 0) return -1;
        int x = arr[front];
        front = (front + 1) % capacity;
        size--;
        return x;
    }

    int getFront() {
        return size == 0 ? -1 : arr[front];
    }

    int getRear() {
        return size == 0 ? -1 : arr[rear];
    }
}

public class ADSWithO1Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter capacity: ");
        int cap = sc.nextInt();
        DS ds = new DS(cap);
        System.out.print("Enter operations: ");
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            System.out.print("1 enqueue, 2 dequeue, 3 front, 4 rear: ");
            int type = sc.nextInt();
            if (type == 1) {
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                ds.enqueue(val);
            } else if (type == 2) {
                System.out.println("Dequeued: " + ds.dequeue());
            } else if (type == 3) {
                System.out.println("Front: " + ds.getFront());
            } else {
                System.out.println("Rear: " + ds.getRear());
            }
        }
    }
}