

public class Post_Order_Traversal {
    public class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public void post_order(Node root){
        if(root == null) return;
        post_order(root.left);
        post_order(root.right);
        System.out.println(root.data + " ");
    }

    public static void main(String[] args) {
        Post_Order_Traversal tree = new Post_Order_Traversal();
        Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        System.out.println("Post-order traversal:");
        tree.post_order(root);
    }
}
