import java.util.Scanner;
import java.util.HashMap;

class RNode {
    int data;
    RNode next, random;
    RNode(int d) { data = d; next = random = null; }
}

public class CloneALinkedListWithRandomPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        RNode head = null, tail = null;
        RNode[] nodes = new RNode[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter data: ");
            int d = sc.nextInt();
            RNode newNode = new RNode(d);
            nodes[i] = newNode;
            if (head == null) head = tail = newNode;
            else { tail.next = newNode; tail = newNode; }
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Enter random index for node " + i + " (-1 for null): ");
            int rand = sc.nextInt();
            if (rand != -1) nodes[i].random = nodes[rand];
        }
        RNode cloned = clone(head);
        RNode temp = cloned;
        while (temp != null) {
            System.out.print("Data: " + temp.data + ", Random: " + (temp.random != null ? temp.random.data : "null") + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static RNode clone(RNode head) {
        if (head == null) return null;
        HashMap<RNode, RNode> map = new HashMap<>();
        RNode curr = head;
        while (curr != null) {
            map.put(curr, new RNode(curr.data));
            curr = curr.next;
        }
        curr = head;
        while (curr != null) {
            RNode clone = map.get(curr);
            clone.next = map.get(curr.next);
            clone.random = map.get(curr.random);
            curr = curr.next;
        }
        return map.get(head);
    }
}