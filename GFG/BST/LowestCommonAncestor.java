package GFG.BST;

public class LowestCommonAncestor {
//    public static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
//        if(p.val>q.val){
//            TreeNode temp = p;
//            p =q;
//            q= temp;
//        }
//
//        while(true){
//            if(p.val == root.val && q.val == root.val) return root;
//            else if(p.val <= root.val && q.val >= root.val) return root;
//
//            else if(p.val <= root.val && q.val <= root.val) root = root.left;
//            else if(p.val >= root.val && q.val >= root.val) root = root.right;
//        }
//    }

    public static TreeNode LCA(TreeNode root, TreeNode p, TreeNode q){
        if(root == null) return null;

        if(p.val < root.val && q.val < root.val) return LCA(root.left,p,q);
        else if(p.val > root.val && q.val > root.val) return LCA(root.right,p,q);
        else return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(LCA(root,root.right,root.left).val);
    }
}
