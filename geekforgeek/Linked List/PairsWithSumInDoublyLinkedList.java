import java.util.Scanner;

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; next = prev = null; }
}

public class PairsWithSumInDoublyLinkedList {
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
        System.out.print("Enter sum: ");
        int sum = sc.nextInt();
        DNode left = head, right = tail;
        boolean found = false;
        while (left != null && right != null && left != right && left.prev != right) {
            int currSum = left.data + right.data;
            if (currSum == sum) {
                System.out.println("(" + left.data + ", " + right.data + ")");
                found = true;
                left = left.next;
                right = right.prev;
            } else if (currSum < sum) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        if (!found) System.out.println("No pairs found");
    }
}