package GFG.BST;

import java.util.*;

public class BFS2 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return Collections.emptyList();
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> list = new ArrayList<>();

            for(int i=0;i<size;i++){
                TreeNode current = q.poll();
                System.out.println("Current: "+current.val);

                list.add(current.val);
                if(current.left !=null){
                    q.add(current.left);
                }
                if(current.right !=null){
                    q.add(current.right);
                }
            }
            ans.add(list);
        }
        Collections.reverse(ans);
        System.out.println();

        return ans;

    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(levelOrderBottom(root));

    }
}
