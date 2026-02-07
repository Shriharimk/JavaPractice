package GFG.BST_GRAPH_Scratch;


//Input: root = [3,9,20,null,null,15,7]
//Output: 3
class MaxDepth {
    int max = Integer.MIN_VALUE;
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int depth = 0;
        dfs(root,depth);
        return max;
    }

    public void dfs(TreeNode root, int depth){
        if(root == null) return;
        depth++;
        if(root.left != null) dfs(root.left,depth);
        if(root.right != null) dfs(root.right,depth);

        max = Math.max(max, depth);

    }
}