import java.util.Scanner;

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; next = prev = null; }
}

public class MergeSortForDoublyLinkedList {
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
        head = mergeSort(head);
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static DNode mergeSort(DNode head) {
        if (head == null || head.next == null) return head;
        DNode mid = getMid(head);
        DNode left = head;
        DNode right = mid.next;
        mid.next = null;
        if (right != null) right.prev = null;
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }
    static DNode getMid(DNode head) {
        DNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static DNode merge(DNode left, DNode right) {
        if (left == null) return right;
        if (right == null) return left;
        if (left.data < right.data) {
            left.next = merge(left.next, right);
            if (left.next != null) left.next.prev = left;
            left.prev = null;
            return left;
        } else {
            right.next = merge(left, right.next);
            if (right.next != null) right.next.prev = right;
            right.prev = null;
            return right;
        }
    }
}