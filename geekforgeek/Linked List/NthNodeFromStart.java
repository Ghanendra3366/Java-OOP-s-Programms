import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class NthNodeFromStart {
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
        Node temp = head;
        for (int i = 1; i < nth && temp != null; i++) temp = temp.next;
        if (temp != null) System.out.println("Nth node: " + temp.data);
        else System.out.println("Not found");
    }
}