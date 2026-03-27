import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class MultiplyTwoNumbersAsLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits in num1: ");
        int n1 = sc.nextInt();
        Node head1 = null, tail1 = null;
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter digit: ");
            int d = sc.nextInt();
            Node newNode = new Node(d);
            if (head1 == null) head1 = tail1 = newNode;
            else { tail1.next = newNode; tail1 = newNode; }
        }
        System.out.print("Enter number of digits in num2: ");
        int n2 = sc.nextInt();
        Node head2 = null, tail2 = null;
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter digit: ");
            int d = sc.nextInt();
            Node newNode = new Node(d);
            if (head2 == null) head2 = tail2 = newNode;
            else { tail2.next = newNode; tail2 = newNode; }
        }
        Node result = multiply(head1, head2);
        Node temp = result;
        while (temp != null) {
            System.out.print(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
    static Node multiply(Node l1, Node l2) {
        Node result = new Node(0);
        Node curr = result;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.data;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.data;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
        }
        return result.next;
    }
}