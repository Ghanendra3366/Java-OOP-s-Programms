import java.util.Scanner;

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; next = prev = null; }
}

public class ReverseADoublyLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        DNode head = null, tail = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            DNode newNode = new DNode(d);
            if (head == null) head = tail = newNode;
            else { tail.next = newNode; newNode.prev = tail; tail = newNode; }
        }
        DNode temp = null, curr = head;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp != null) head = temp.prev;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}