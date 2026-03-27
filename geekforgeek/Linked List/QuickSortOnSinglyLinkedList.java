import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class QuickSortOnSinglyLinkedList {
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
        head = quickSort(head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node quickSort(Node head) {
        if (head == null || head.next == null) return head;
        Node pivot = head;
        Node lessHead = null, lessTail = null, greaterHead = null, greaterTail = null;
        Node curr = head.next;
        while (curr != null) {
            if (curr.data < pivot.data) {
                if (lessHead == null) lessHead = lessTail = curr;
                else { lessTail.next = curr; lessTail = curr; }
            } else {
                if (greaterHead == null) greaterHead = greaterTail = curr;
                else { greaterTail.next = curr; greaterTail = curr; }
            }
            curr = curr.next;
        }
        if (lessTail != null) lessTail.next = null;
        if (greaterTail != null) greaterTail.next = null;
        Node left = quickSort(lessHead);
        Node right = quickSort(greaterHead);
        pivot.next = right;
        if (left == null) return pivot;
        Node temp = left;
        while (temp.next != null) temp = temp.next;
        temp.next = pivot;
        return left;
    }
}