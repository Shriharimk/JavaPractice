package GFG.BST;


class PathSum {
    static boolean temp = false;
    static int target;
     public static boolean hasPathSum(TreeNode root, int targetSum) {
         target = targetSum;
         System.out.println("target = "+ target);
         dfs(root,0,0);
         return temp;
     }

     public static void dfs(TreeNode root,int depth,int sum){
         if(root != null){
             depth++;

             System.out.println("****");
             System.out.println("Node: "+root.val);
             System.out.println("depth: "+depth);
             System.out.println("old sum = "+ sum);
             System.out.println("temp = "+ temp);

             sum = sum+root.val;
             System.out.println("new sum = "+ sum);
             if(root.left == null && root.right==null && sum==target){
                 temp = true;
                 return;
             }
             dfs(root.left,depth,sum);
             dfs(root.right,depth,sum);
         }
     }

     //alternatively
//     public boolean hasPathSum(TreeNode root, int targetSum) {
//         if(root == null){
//             return false;
//         }
//         if(root.left ==null && root.right ==null){
//             return targetSum==root.val;
//         }
//         return hasPathSum(root.left,targetSum-root.val) ||
//                 hasPathSum(root.right,targetSum-root.val);
//     }

    public static void main(String[] args){
         TreeNode root = new TreeNode(5);
         root.left = new TreeNode(4);
         root.right = new TreeNode(8);
         root.left.left = new TreeNode(11);
         root.left.left.left = new TreeNode(7);
         root.left.left.right = new TreeNode(2);
        System.out.println(hasPathSum(root,22));
    }
 }
