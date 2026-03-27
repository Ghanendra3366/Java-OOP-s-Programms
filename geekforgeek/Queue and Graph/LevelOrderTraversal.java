import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) { this.val = val; }
}

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Assuming input for tree, but for simplicity, hardcode or take array
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        TreeNode root = buildTree(arr, 0);
        levelOrder(root);
    }
    static TreeNode buildTree(int[] arr, int i) {
        if (i >= arr.length || arr[i] == -1) return null;
        TreeNode root = new TreeNode(arr[i]);
        root.left = buildTree(arr, 2 * i + 1);
        root.right = buildTree(arr, 2 * i + 2);
        return root;
    }
    static void levelOrder(TreeNode root) {
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            System.out.print(node.val + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
}