package GFG.BST;

class MinDepth {
    static int min = Integer.MAX_VALUE;
    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        dfs(root,0);
        return min;
    }

    public static void dfs(TreeNode root,int depth){
        if(root != null){
            depth++;
            if(root.left==null && root.right==null && depth < min){
                min = depth;
            }
            dfs(root.left,depth);
            dfs(root.right,depth);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        root.right.right.right.right = new TreeNode(6);
        System.out.println(minDepth(root));
    }
}
