import java.util.Scanner;

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; next = prev = null; }
}

public class RotateDoublyLinkedListByNNodes {
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
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        if (k == 0 || head == null) {
            DNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
        k %= n;
        if (k == 0) {
            DNode temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
        DNode curr = head;
        for (int i = 1; i < k; i++) curr = curr.next;
        DNode newHead = curr.next;
        curr.next = null;
        if (newHead != null) newHead.prev = null;
        tail.next = head;
        head.prev = tail;
        head = newHead;
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}