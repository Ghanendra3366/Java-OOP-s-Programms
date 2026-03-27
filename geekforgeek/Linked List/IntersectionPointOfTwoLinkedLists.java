import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class IntersectionPointOfTwoLinkedLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes in list1: ");
        int n1 = sc.nextInt();
        Node head1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            Node newNode = new Node(d);
            if (head1 == null) head1 = tail1 = newNode;
            else { tail1.next = newNode; tail1 = newNode; }
        }
        System.out.print("Enter number of nodes in list2: ");
        int n2 = sc.nextInt();
        Node head2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            Node newNode = new Node(d);
            if (head2 == null) head2 = tail2 = newNode;
            else { tail2.next = newNode; tail2 = newNode; }
        }
        System.out.print("Enter intersection position from list1 (0 for no intersection): ");
        int inter = sc.nextInt();
        if (inter > 0 && inter <= n1) {
            Node temp = head1;
            for (int i = 1; i < inter; i++) temp = temp.next;
            tail2.next = temp;
        }
        Node intersection = getIntersection(head1, head2);
        if (intersection != null) System.out.println("Intersection at: " + intersection.data);
        else System.out.println("No intersection");
    }
    static Node getIntersection(Node head1, Node head2) {
        Node a = head1, b = head2;
        while (a != b) {
            a = a == null ? head2 : a.next;
            b = b == null ? head1 : b.next;
        }
        return a;
    }
}