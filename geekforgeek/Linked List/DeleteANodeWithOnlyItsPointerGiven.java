import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class DeleteANodeWithOnlyItsPointerGiven {
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
        System.out.print("Enter position to delete (1-based): ");
        int pos = sc.nextInt();
        if (pos >= 1 && pos <= n) {
            Node toDelete = nodes[pos - 1];
            if (toDelete.next != null) {
                toDelete.data = toDelete.next.data;
                toDelete.next = toDelete.next.next;
            } else {
                // Last node, but since we have pointer, assume not last
                System.out.println("Cannot delete last node with only pointer");
            }
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}