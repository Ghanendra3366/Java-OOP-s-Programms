import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class RemoveEveryKthNode {
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
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        int count = 0;
        while (prev.next != null) {
            count++;
            if (count % k == 0) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        head = dummy.next;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}