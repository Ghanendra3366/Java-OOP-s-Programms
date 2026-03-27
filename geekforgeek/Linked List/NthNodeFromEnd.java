import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class NthNodeFromEnd {
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
        System.out.print("Enter n: ");
        int nth = sc.nextInt();
        Node slow = head, fast = head;
        for (int i = 0; i < nth; i++) {
            if (fast == null) {
                System.out.println("Not found");
                return;
            }
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("Nth from end: " + slow.data);
    }
}