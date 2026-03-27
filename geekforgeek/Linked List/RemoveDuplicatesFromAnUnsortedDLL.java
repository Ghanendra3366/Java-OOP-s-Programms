import java.util.Scanner;
import java.util.HashSet;

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; next = prev = null; }
}

public class RemoveDuplicatesFromAnUnsortedDLL {
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
        HashSet<Integer> seen = new HashSet<>();
        DNode curr = head;
        while (curr != null) {
            if (seen.contains(curr.data)) {
                if (curr.prev != null) curr.prev.next = curr.next;
                if (curr.next != null) curr.next.prev = curr.prev;
            } else {
                seen.add(curr.data);
            }
            curr = curr.next;
        }
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}