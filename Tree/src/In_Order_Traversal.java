public class In_Order_Traversal {
    public class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }
    public void in_order_traversal(Node root){
        if(root == null) return ;
        in_order_traversal(root.left);
        System.out.println(root.data + " ");
        in_order_traversal(root.right);

    }
    public static void main(String[] args) {
     In_Order_Traversal tree = new In_Order_Traversal();
     In_Order_Traversal.Node root = tree.new Node(1);
        root.left = tree.new Node(2);
        root.right = tree.new Node(3);
        root.left.left = tree.new Node(4);
        root.left.right = tree.new Node(5);

        System.out.println("Post-order traversal:");
        tree.in_order_traversal(root);
    }
}
