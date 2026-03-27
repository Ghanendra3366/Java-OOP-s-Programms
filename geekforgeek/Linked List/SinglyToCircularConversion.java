import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class SinglyToCircularConversion {
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
        if (tail != null) tail.next = head; // Convert to circular
        Node temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }
}