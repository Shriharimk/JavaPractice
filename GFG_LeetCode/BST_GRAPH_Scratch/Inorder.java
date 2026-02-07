package GFG.BST_GRAPH_Scratch;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//94. Binary Tree Inorder Traversal
// Given the root of a binary tree, return the inorder traversal of its nodes' values.

//Example 1:
//
//Input: root = [1,null,2,3]
//
//Output: [1,3,2]

class Inorder {
    List<Integer> res = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) return Collections.emptyList();
        inorder(root);
        return res.size()==0? null: res;
    }

    public void inorder(TreeNode root){
        if(root == null) return;

        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }

    public static void main(String[] args) {

    }
}