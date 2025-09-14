package GFG.BST;


/**
 * 543. Diameter of Binary Tree
 *
 * Given the root of a binary tree, return the length of the diameter of the tree.
 * The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
 * This path may or may not pass through the root.
 * The length of a path between two nodes is represented by the number of edges between them.
 *
 * Example 1:
 * Input: root = [1,2,3,4,5]
 * Output: 3
 */


public class DiameterOfTree {
    static int diameter = Integer.MIN_VALUE;
    public static int diameter(TreeNode root){
        if(root == null) return 0;
        dfs(root);
        return diameter;
    }
    public static int dfs(TreeNode node){
        if(node == null) return 0;

        int leftHeight = dfs(node.left);
        int rightHeight = dfs(node.right);

        diameter = Math.max(diameter,leftHeight+rightHeight);

        return Math.max(leftHeight,rightHeight)+1;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(diameter(root));
    }
}
