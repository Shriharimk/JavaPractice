package GFG.BST;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 700. Search in a Binary Search Tree
 * You are given the root of a binary search tree (BST) and an integer val.
 *
 * Find the node in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.
 *
 *
 *
 * Example 1:
 * Input: root = [4,2,7,1,3], val = 2
 * Output: [2,1,3]
 */

class searchInBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode current = q.poll();
            if(current.val == val){
                return current;
            }
            if(current.left != null){
                q.add(current.left);
            }
            if(current.right != null){
                q.add(current.right);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        // Build the tree [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(3);

        searchInBST bfsObj = new searchInBST();
        TreeNode result = bfsObj.searchBST(root,2);

        System.out.println(result.val); // Expected: [[2,1,3]]
    }
}
