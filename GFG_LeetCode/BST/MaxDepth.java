package GFG.BST;

public class MaxDepth {
   public static int max = Integer.MIN_VALUE;

    public static int maxDepth(Node node){
        if(node == null){
            return 0;
        }
        depth(node,0);
        return max;
    }

    public static void depth(Node node, int depth){
        if(node != null){
            depth++;
            max = Math.max(max,depth);
            depth(node.left,depth);
            depth(node.right,depth);
        }
    }

    public static void main(String[] args){
        Node root = new Node(3);
        root.left = (new Node(9));
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(17);
        System.out.println(maxDepth(root));
    }
}

