import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class SearchInALinkedList {
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
        System.out.print("Enter key to search: ");
        int key = sc.nextInt();
        Node temp = head;
        int pos = 1;
        boolean found = false;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Found at position: " + pos);
                found = true;
                break;
            }
            temp = temp.next;
            pos++;
        }
        if (!found) System.out.println("Not found");
    }
}