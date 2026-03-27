import java.util.Scanner;

class CNode {
    int data;
    CNode next;
    CNode(int d) { data = d; next = null; }
}

public class SplitACircularLinkedListIntoTwoHalves {
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
        CNode[] halves = splitCircular(head);
        System.out.print("First half: ");
        CNode temp = halves[0];
        if (temp != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != halves[0]);
        }
        System.out.println();
        System.out.print("Second half: ");
        temp = halves[1];
        if (temp != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != halves[1]);
        }
        System.out.println();
    }
    static CNode[] splitCircular(CNode head) {
        if (head == null) return new CNode[]{null, null};
        CNode slow = head, fast = head;
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }
        CNode head2 = slow.next;
        slow.next = head;
        CNode temp = head2;
        while (temp.next != head) temp = temp.next;
        temp.next = head2;
        return new CNode[]{head, head2};
    }
}