package GFG.BST;

class IsSameTree {

    //this also works but there is prblem with the glbal val


    // boolean val = true;
    // public boolean isSameTree(TreeNode p, TreeNode q) {
    //     if(p == null && q == null) return true;

    //     if(p == null && q != null|| p != null && q == null) return false;

    //     if(p.left==null && q.left!=null || p.left!=null && q.left==null) return false;
    //     if(p.right==null && q.right!=null || p.right!=null && q.right==null) return false;


    //     if(p!=null && q !=null){
    //         if(p.val != q.val){
    //             System.out.println("Here");
    //             val = false;
    //         }
    //         isSameTree(p.left,q.left);
    //         isSameTree(p.right,q.right);
    //     }

    //     return val;

    // }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        if(p ==null || q == null) return false; //either of them are null other isnt

        if(p.val != q.val) return false;

        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    public static void main(String[] args){
        TreeNode p = new TreeNode(2);
        p.left = new TreeNode(1);

        TreeNode q = new TreeNode(2);
        q.right = new TreeNode(1);

        System.out.println(isSameTree(p,q));
    }


}
