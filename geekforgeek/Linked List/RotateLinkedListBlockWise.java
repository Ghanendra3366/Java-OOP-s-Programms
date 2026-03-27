import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class RotateLinkedListBlockWise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        Node head = null, tail = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            Node newNode = new Node(d);
            if (head == null) head = tail = newNode;
            else { tail.next = newNode; tail = newNode; }
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        head = rotateBlockWise(head, k);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node rotateBlockWise(Node head, int k) {
        if (head == null || k == 0) return head;
        Node curr = head;
        int count = 1;
        while (count < k && curr != null) {
            curr = curr.next;
            count++;
        }
        if (curr == null) return head;
        Node kth = curr;
        while (curr.next != null) curr = curr.next;
        curr.next = head;
        head = kth.next;
        kth.next = null;
        return head;
    }
}