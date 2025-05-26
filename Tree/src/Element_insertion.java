import java.sql.SQLOutput;

public class Element_insertion {
   static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data= data;
            this.left  = null;
            this.right = null;
        }
        public static Node  Insertion( Node root, int key){
            if(root == null) {
                return new Node(key);
            }
            if(key<root.data){
                root.left = Insertion(root.left , key);
            }else{
                root.right = Insertion(root.right , key);
            }
         return root;
        }

        public static void Inorder(Node root){
            if(root == null) return;

            Inorder(root.left);
            System.out.println(root.data + " ");
            Inorder(root.right);
        }
    }
    public static void main(String[] args) {
        Node root = null;
        int[] elements = {50, 30, 20, 40, 70, 60, 80};

        for (int el : elements) {
            root = Node.Insertion(root, el);
        }

        System.out.println("In-order Traversal of BST:");
        Node.Inorder(root);
    }
}
