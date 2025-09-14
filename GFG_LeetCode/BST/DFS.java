package GFG.BST;

import java.util.ArrayList;
import java.util.List;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}

public class DFS {
    static Node root;

    public static List<Integer> inorderTrav(List<Integer> list) {
        return inorderTraversal(list);
    }


    public static List<Integer> inorderTraversal( List<Integer> list) {
        List<Integer> res = new ArrayList<>();
        temp(root,res);
        return res;
    }

    public static void temp(Node root, List<Integer> list){
        if(root == null){
            return;
        }
        temp(root.left, list);
        list.add(root.data);
        temp(root.right,list);
    }

    public static void main(String args[]){
        List<Integer> list = List.of(1,null,2,3);
        System.out.println(inorderTrav(list));
    }
}
