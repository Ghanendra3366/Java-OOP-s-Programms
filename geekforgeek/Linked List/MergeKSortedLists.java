import java.util.Scanner;
import java.util.PriorityQueue;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class MergeKSortedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        Node[] lists = new Node[k];
        for (int i = 0; i < k; i++) {
            System.out.print("Enter number of nodes in list " + (i+1) + ": ");
            int n = sc.nextInt();
            Node head = null, tail = null;
            for (int j = 0; j < n; j++) {
                System.out.print("Enter data: ");
                int d = sc.nextInt();
                Node newNode = new Node(d);
                if (head == null) head = tail = newNode;
                else { tail.next = newNode; tail = newNode; }
            }
            lists[i] = head;
        }
        Node merged = mergeKLists(lists);
        Node temp = merged;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static Node mergeKLists(Node[] lists) {
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.data - b.data);
        for (Node list : lists) {
            if (list != null) pq.add(list);
        }
        Node dummy = new Node(0);
        Node curr = dummy;
        while (!pq.isEmpty()) {
            Node min = pq.poll();
            curr.next = min;
            curr = curr.next;
            if (min.next != null) pq.add(min.next);
        }
        return dummy.next;
    }
}