import java.util.Scanner;
import java.util.HashSet;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class UnionAndIntersection {
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
        HashSet<Integer> set1 = new HashSet<>();
        Node temp = head1;
        while (temp != null) {
            set1.add(temp.data);
            temp = temp.next;
        }
        HashSet<Integer> set2 = new HashSet<>();
        temp = head2;
        while (temp != null) {
            set2.add(temp.data);
            temp = temp.next;
        }
        HashSet<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.print("Union: ");
        for (int val : union) System.out.print(val + " ");
        System.out.println();
        System.out.print("Intersection: ");
        for (int val : intersection) System.out.print(val + " ");
        System.out.println();
    }
}