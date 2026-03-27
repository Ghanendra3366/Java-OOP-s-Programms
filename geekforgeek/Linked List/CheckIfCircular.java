import java.util.Scanner;

class CNode {
    int data;
    CNode next;
    CNode(int d) { data = d; next = null; }
}

public class CheckIfCircular {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        CNode head = null, tail = null;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            CNode newNode = new CNode(d);
            if (head == null) head = tail = newNode;
            else { tail.next = newNode; tail = newNode; }
        }
        if (tail != null) tail.next = head; // Make circular
        boolean isCircular = false;
        if (head != null) {
            CNode slow = head, fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    isCircular = true;
                    break;
                }
            }
        }
        System.out.println(isCircular ? "Circular" : "Not circular");
    }
}