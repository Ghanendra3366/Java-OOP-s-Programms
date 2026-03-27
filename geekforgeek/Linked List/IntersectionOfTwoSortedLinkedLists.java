import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class IntersectionOfTwoSortedLinkedLists {
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
        Node result = null, tail = null;
        Node a = head1, b = head2;
        while (a != null && b != null) {
            if (a.data == b.data) {
                Node newNode = new Node(a.data);
                if (result == null) result = tail = newNode;
                else { tail.next = newNode; tail = newNode; }
                a = a.next;
                b = b.next;
            } else if (a.data < b.data) {
                a = a.next;
            } else {
                b = b.next;
            }
        }
        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}