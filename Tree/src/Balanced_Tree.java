public class Balanced_Tree {

     static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean balanced_tree(Node root){
        return height(root) != -1;
    }

    public static int height(Node root){
        if(root==null) return 0;

        int left = height(root.left);
        if(left == -1) return -1;

        int right = height(root.right);
        if(right==-1) return -1;

        if(Math.abs(left-right)>1) return -1;

        return Math.max(left,right) +1;
    }
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println("Is the tree balanced? " + balanced_tree(root));
    }
    }

