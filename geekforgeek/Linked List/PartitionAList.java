import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class PartitionAList {
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
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        Node lessHead = null, lessTail = null, greaterHead = null, greaterTail = null;
        Node curr = head;
        while (curr != null) {
            if (curr.data < x) {
                if (lessHead == null) lessHead = lessTail = curr;
                else { lessTail.next = curr; lessTail = curr; }
            } else {
                if (greaterHead == null) greaterHead = greaterTail = curr;
                else { greaterTail.next = curr; greaterTail = curr; }
            }
            curr = curr.next;
        }
        if (lessTail != null) lessTail.next = greaterHead;
        if (greaterTail != null) greaterTail.next = null;
        head = lessHead != null ? lessHead : greaterHead;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}