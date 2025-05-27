// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// Class containing the logic to compare trees
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Both nodes are null
        if (p == null && q == null) {
            return true;
        }

        // One of them is null or values are not equal
        if (p == null || q == null || p.val != q.val) {
            return false;
        }

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

// Main class to test the solution
public class Same_Tree {
    public static void main(String[] args) {
        // Construct Tree 1
        TreeNode tree1 = new TreeNode(1);
        tree1.left = new TreeNode(2);
        tree1.right = new TreeNode(3);

        // Construct Tree 2
        TreeNode tree2 = new TreeNode(1);
        tree2.left = new TreeNode(2);
        tree2.right = new TreeNode(3);

        // Create Same_Tree instance and test
        Solution sol = new Solution();
        boolean result = sol.isSameTree(tree1, tree2);

        // Output result
        System.out.println("Are the two trees the same? " + result);
    }
}
