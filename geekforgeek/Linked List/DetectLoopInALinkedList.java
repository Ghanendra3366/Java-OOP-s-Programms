import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class DetectLoopInALinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null, tail = null;
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            Node newNode = new Node(d);
            nodes[i] = newNode;
            if (head == null) head = tail = newNode;
            else { tail.next = newNode; tail = newNode; }
        }
        System.out.print("Enter loop position (0 for no loop): ");
        int loopPos = sc.nextInt();
        if (loopPos > 0 && loopPos <= n) tail.next = nodes[loopPos - 1];
        boolean hasLoop = false;
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasLoop = true;
                break;
            }
        }
        System.out.println(hasLoop ? "Loop detected" : "No loop");
    }
}