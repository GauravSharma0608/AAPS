import java.util.*;

public class Preordertraversal {

    // Definition of a TreeNode
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Recursive Preorder Traversal
    public static void preorder(TreeNode root) {
        if (root == null) return;

        System.out.print(root.val + " "); // Visit root
        preorder(root.left);              // Visit left subtree
        preorder(root.right);             // Visit right subtree
    }

    public static void main(String[] args) {
        // Example tree:
        //       1
        //     /   \
        //    2     3
        //   / \   /
        //  4   5 6

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        System.out.print("Preorder Traversal: ");
        preorder(root);  // Output: 1 2 4 5 3 6
    }
}

