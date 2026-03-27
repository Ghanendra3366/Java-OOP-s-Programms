import java.util.Scanner;

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; next = prev = null; }
}

public class InsertInSortedWayInDoublyLinkedList {
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
        System.out.print("Enter data to insert: ");
        int d = sc.nextInt();
        DNode newNode = new DNode(d);
        if (head == null) head = newNode;
        else if (head.data >= d) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else {
            DNode curr = head;
            while (curr.next != null && curr.next.data < d) curr = curr.next;
            newNode.next = curr.next;
            if (curr.next != null) curr.next.prev = newNode;
            curr.next = newNode;
            newNode.prev = curr;
        }
        
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}