import java.util.Scanner;

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; next = prev = null; }
}

public class ReverseADoublyLinkedListInGroups {
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
        head = reverseInGroups(head, k);
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static DNode reverseInGroups(DNode head, int k) {
        if (head == null) return null;
        DNode curr = head, next = null, prev = null;
        int count = 0;
        while (curr != null && count < k) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
            count++;
        }
        if (next != null) {
            head.next = reverseInGroups(next, k);
            if (head.next != null) head.next.prev = head;
        }
        return prev;
    }
}