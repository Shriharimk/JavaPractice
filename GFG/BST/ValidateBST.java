package GFG.BST;

public class ValidateBST {

    public static boolean isValidBST(TreeNode root){
        return validateBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean validateBST(TreeNode node, long min, long max){
        if(node == null) return true;

        if(node.val <= min || node.val >= max) return false;

        return validateBST(node.left,min,node.val) && validateBST(node.right,node.val,max);
    }

    public static void main(String[] args) {
        TreeNode root= new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        System.out.println(isValidBST(root));
    }

}
