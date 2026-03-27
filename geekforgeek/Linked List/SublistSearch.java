import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class SublistSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes in main list: ");
        int n1 = sc.nextInt();
        Node head1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            Node newNode = new Node(d);
            if (head1 == null) head1 = tail1 = newNode;
            else { tail1.next = newNode; tail1 = newNode; }
        }
        System.out.print("Enter number of nodes in sublist: ");
        int n2 = sc.nextInt();
        Node head2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            Node newNode = new Node(d);
            if (head2 == null) head2 = tail2 = newNode;
            else { tail2.next = newNode; tail2 = newNode; }
        }
        boolean found = isSublist(head1, head2);
        System.out.println(found ? "Sublist found" : "Not found");
    }
    static boolean isSublist(Node head1, Node head2) {
        if (head2 == null) return true;
        if (head1 == null) return false;
        Node a = head1, b = head2;
        while (a != null) {
            if (a.data == b.data) {
                Node tempA = a, tempB = b;
                while (tempA != null && tempB != null && tempA.data == tempB.data) {
                    tempA = tempA.next;
                    tempB = tempB.next;
                }
                if (tempB == null) return true;
            }
            a = a.next;
        }
        return false;
    }
}