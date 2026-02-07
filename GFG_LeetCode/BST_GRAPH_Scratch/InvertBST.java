package GFG.BST_GRAPH_Scratch;


//https://www.youtube.com/watch?v=OnSn2XEQ4MY
//Input: root = [4,2,7,1,3,6,9]
//Output: [4,7,2,9,6,3,1]

class InvertBST {
    TreeNode res;
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        invertTr(root);
        return root;
    }

    public void invertTr(TreeNode root){
        if(root ==null){
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTr(root.left);
        invertTr(root.right);
    }
}
