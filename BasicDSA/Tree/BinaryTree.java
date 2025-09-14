package BasicDSA.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    public class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    Node root;

    public void printTree(){
        System.out.println("In Order");
        inOrder(root);
        System.out.println("\nPre Order");
        preOrder(root);
        System.out.println("\nPost Order");
        postOrder(root);
    }
    public void inOrder(Node root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + "->");
            inOrder(root.right);
        }
    }

    public void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + "->");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + "->");
        }
    }

    //IRL USECASE
//    public List<Integer> inorderTraversal(Node root) {
//        List<Integer> res = new LinkedList<Integer>();
//        temp(root,res);
//        return res;
//    }
//
//    public void temp(Node root, List<Integer> list){
//        if(root == null){
//            return;
//        }
//        temp(root.left, list);
//        list.add(root.val);
//        temp(root.right,list);
//    }

    public void insert(int data){
        root = insertRec(root,data);
    }

    public Node insertRec(Node root, int data){
        if(root == null){
            return new Node(data);
        }
        else if(data < root.data) {
            root.left = insertRec(root.left, data);
        }
        else if(data> root.data){
            root.right = insertRec(root.right,data);
        }
        return root;
    }

//    public void bfs() {
//        if (root == null) {
//            System.out.println("Tree is empty");
//            return;
//        }
//
//        Queue<Node> queue = new LinkedList<>();
//        queue.add(root);
//
//        while (!queue.isEmpty()) {
//            Node current = queue.poll(); //remove the head of the queue
//            System.out.print(current.data + "->");
//
//            if (current.left != null) {
//                queue.add(current.left);
//            }
//            if (current.right != null) {
//                queue.add(current.right);
//            }
//        }
//        System.out.println();
//    }

    public void bfs(){
        if(root == null){
            System.out.println( "Empty tree");
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node cur = q.poll();
            System.out.print(cur.data +" -> ");
            if(cur.left != null)
                q.add(cur.left);
            if(cur.right != null)
                q.add(cur.right);
        }
    }


    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(5);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        System.out.println("DFS");
        tree.printTree();
        System.out.println("\nBFS");
        tree.bfs();
    }


}
