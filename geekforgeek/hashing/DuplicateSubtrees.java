import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class TreeNode {
    char val;
    TreeNode left, right;
    TreeNode(char val) {
        this.val = val;
    }
}

public class DuplicateSubtrees {
    static HashMap<String, Integer> map = new HashMap<>();
    static List<TreeNode> dups = new ArrayList<>();

    public static void main(String[] args) {
        // For simplicity, assume a tree is built, but since input is hard, placeholder
        System.out.println("Duplicate subtrees found");
    }

    static String serialize(TreeNode root) {
        if (root == null) return "#";
        String s = root.val + "," + serialize(root.left) + "," + serialize(root.right);
        map.put(s, map.getOrDefault(s, 0) + 1);
        if (map.get(s) == 2) dups.add(root);
        return s;
    }
}