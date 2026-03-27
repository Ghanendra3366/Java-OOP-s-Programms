import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class SegregateEvenAndOddNodes {
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
        Node evenHead = null, evenTail = null, oddHead = null, oddTail = null;
        Node curr = head;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenHead == null) evenHead = evenTail = curr;
                else { evenTail.next = curr; evenTail = curr; }
            } else {
                if (oddHead == null) oddHead = oddTail = curr;
                else { oddTail.next = curr; oddTail = curr; }
            }
            curr = curr.next;
        }
        if (evenTail != null) evenTail.next = oddHead;
        if (oddTail != null) oddTail.next = null;
        head = evenHead != null ? evenHead : oddHead;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}