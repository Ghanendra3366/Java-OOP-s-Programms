import java.util.Scanner;

class CNode {
    int data;
    CNode next;
    CNode(int d) { data = d; next = null; }
}

public class DeletionFromACircularLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        CNode head = null, tail = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            CNode newNode = new CNode(d);
            if (head == null) head = tail = newNode;
            else { tail.next = newNode; tail = newNode; }
        }
        if (tail != null) tail.next = head; // Make circular
        System.out.print("Enter key to delete: ");
        int key = sc.nextInt();
        if (head != null) {
            CNode temp = head, prev = null;
            do {
                if (temp.data == key) {
                    if (prev != null) prev.next = temp.next;
                    else {
                        // Deleting head
                        CNode last = head;
                        while (last.next != head) last = last.next;
                        if (head == head.next) head = null;
                        else { head = head.next; last.next = head; }
                    }
                    break;
                }
                prev = temp;
                temp = temp.next;
            } while (temp != head);
        }
        CNode temp = head;
        if (temp != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.println();
    }
}