package GFG.BST;

class DeleteInBST {
    static int gkey = 0;
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;

        // this is a bst so left elements will be lesser than right elements
        if(key < root.val){
            root.left = deleteNode(root.left,key);
        }else if(key > root.val){
            root.right = deleteNode(root.right,key);
        }
        else{
            //at this point we have either reached last node or we have reached value
            if(root.left == null) return root.right; //if node to right is present
            if(root.right == null) return root.left; // if node to left of root is present

            TreeNode minNode = findMin(root.right); //if both left and right of the root have nodes then choose
                                                    // leftmost of the right sub treee
            root.val = minNode.val;
            root.right = deleteNode(root.right, minNode.val);
        }
        return root;
    }

    public static TreeNode findMin(TreeNode root){
        while(root.left != null) root = root.left; // go on until u end up at the left most node in that subtree
        return root;
    }


    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);

        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);
        System.out.println(deleteNode(root,3));


    }
}
