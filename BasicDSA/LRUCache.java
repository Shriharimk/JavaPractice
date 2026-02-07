package BasicDSA;

import java.util.HashMap;

//https://www.youtube.com/watch?v=z9bJUPxzFOw

public class LRUCache {

    public  class Node{
        int key;
        int value;
        Node next;
        Node previous;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
            this.previous = null;
        }

        public Node(int key, int value, Node next, Node prev){
            this.key = key;
            this.value = value;
            this.next = next;
            this.previous = prev;
        }
    }

    int capacity = 0;
    HashMap<Integer, Node> map = new HashMap<>();
    Node head, tail;

    public LRUCache(int capacity){
        this.capacity = capacity;

        this.head = new Node(0,0);
        this.tail = new Node(0,0);

        this.head.next = tail;
        this.head.previous = null;

        this.tail.previous = head;
        this.tail.next = null;
    }

    public void insertFromHead(Node newNode){
        Node nextNode = head.next;
        nextNode.previous = newNode;

        newNode.next = nextNode;
        newNode.previous = head;

        head.next = newNode;
    }

    public void deleteNode(Node node){
        Node previousNode = node.previous;
        Node nextNode = node.next;

        previousNode.next = nextNode;
        nextNode.previous = previousNode;
    }

    public int deleteTail(){
        Node temp = tail.previous;
        deleteNode(temp);
        return tail.key;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            Node nodeFromMap = map.get(key);
            int value = nodeFromMap.value;
            deleteNode(nodeFromMap);
            insertFromHead(nodeFromMap);
            return value;
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node nodeFromMap = map.get(key);
            nodeFromMap.value = value; // update
            deleteNode(nodeFromMap);
            insertFromHead(nodeFromMap);
        }else{
            if(map.size()>=capacity){
                int deletedKey = deleteTail();
                map.remove(deletedKey);
            }
            Node newNode = new Node(key,value);
            insertFromHead(newNode);
            map.put(key,newNode);
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        cache.get(1);
        cache.put(3,3);
        cache.get(2);

    }
}
