public class Search_Binary_Tree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node searchBinaryTree(Node root, int x) {
        while (root != null) {
            if (root.data < x) {
                root = root.right;
            } else if (root.data > x) {
                root = root.left;
            } else {
                return root; // Found the node
            }
        }
        return null; // Not found
    }

    public static void main(String[] args) {
        // Sample tree:
        //       10
        //      /  \
        //     5   15
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);

        int target = 15;
        Node result = searchBinaryTree(root, target);

        if (result != null) {
            System.out.println("Found: " + result.data);
        } else {
            System.out.println("Not found.");
        }
    }
}
 