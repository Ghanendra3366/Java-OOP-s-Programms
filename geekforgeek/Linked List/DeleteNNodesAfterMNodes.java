import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class DeleteNNodesAfterMNodes {
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
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print("Enter n: ");
        int nn = sc.nextInt();
        head = deleteNAfterM(head, m, nn);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node deleteNAfterM(Node head, int m, int n) {
        Node curr = head;
        while (curr != null) {
            for (int i = 0; i < m - 1 && curr != null; i++) curr = curr.next;
            if (curr == null) return head;
            Node temp = curr.next;
            for (int i = 0; i < n && temp != null; i++) temp = temp.next;
            curr.next = temp;
            curr = temp;
        }
        return head;
    }
}