public class Height_of_Binary_Tree {
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
        public static int height(Node root) {
            if (root == null) return 0;
              int lst = height(root.left);
                int rst = height(root.right);
                return Math.max(lst ,rst) + 1;
            }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Height of tree: " + height(root));
    }
}
