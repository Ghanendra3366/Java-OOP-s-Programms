import java.util.Scanner;
import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class RemoveDuplicatesFromAnUnsortedLinkedList {
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
        HashSet<Integer> seen = new HashSet<>();
        Node curr = head, prev = null;
        while (curr != null) {
            if (seen.contains(curr.data)) {
                prev.next = curr.next;
            } else {
                seen.add(curr.data);
                prev = curr;
            }
            curr = curr.next;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}