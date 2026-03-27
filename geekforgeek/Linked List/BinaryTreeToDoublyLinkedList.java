import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left, right;
    TreeNode(int d) { data = d; left = right = null; }
}

class DNode {
    int data;
    DNode next, prev;
    DNode(int d) { data = d; next = prev = null; }
}

public class BinaryTreeToDoublyLinkedList {
    static DNode head, prev;
    public static void main(String[] args) {
        // For simplicity, create a sample tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(30);
        convert(root);
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void convert(TreeNode root) {
        if (root == null) return;
        convert(root.left);
        DNode node = new DNode(root.data);
        if (prev == null) head = node;
        else {
            prev.next = node;
            node.prev = prev;
        }
        prev = node;
        convert(root.right);
    }
}