public class Diameter_of_Binary_tree {
    // TreeNode class
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    int dia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia;
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        dia = Math.max(dia, lh + rh); // diameter at current node

        return Math.max(lh, rh) + 1;
    }

    public static void main(String[] args) {
        Diameter_of_Binary_tree tree = new Diameter_of_Binary_tree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of tree: " + tree.diameterOfBinaryTree(root)); // Expected: 3
    }
}