package BasicDSA;

//Implementation of LinkedList without the Collection Framework
public class LinkedList {
    public Node head;
    int size;

    public LinkedList(){
        size = 0;
    }

    public class Node{
        public int data;
        public Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){// when there are no items in the linkedList
            head = newNode;
            return;
        }
        if(head.next == null){// when there is only one element in the linkedList
            head.next = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!=null){//once this loop is over, the lastNode is infact the lastNode
            lastNode=lastNode.next;
        }
        lastNode.next = newNode;
    }

    public void printList(){
        Node currentNode = head;
        while( currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode = currentNode.next;
        }
        System.out.print("null\n");
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("List Empty");
            return;
        }
        size--;
        System.out.println("deleting :"+head.data);
        head = head.next;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("empty ll");
            return;
        }
        size--;
        if(head.next == null){
            System.out.println("deleting :"+head.data);
            head = null;
            return;
        }
        Node currNode = head;//starting from head
        Node lastNode = head.next;// starting from one node after head
        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        System.out.println("deleting: "+lastNode.data);
        currNode.next = null;
    }
    public int size(){
        return size;
    }

    //reverse list -  throught iteration
    public void reverse(){
        if(head == null || head.next == null){//empty list or single element in list
            return;
        }
        Node previousNode = head;
        Node currentNode = head.next;
        while(currentNode != null){
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;

            previousNode = currentNode;
            currentNode = nextNode;
        }
        head.next = null;
        head = previousNode;
    }

    //reverse list -  throught recursion
    public Node reverseRec(Node head){
        if(head == null || head.next == null){//empty list or single element in list
            return head;
        }
        Node newHead = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(40);
        list.addFirst(50);
        list.addLast(60);
        list.addLast(70);
        list.printList();
        System.out.println("Size: "+list.size());
        list.removeFirst();
        list.removeLast();
        list.printList();
        System.out.println("Size: "+list.size());     
        list.reverse();   
        list.printList();
        list.head = list.reverseRec(list.head);
        list.printList();
    }
}
