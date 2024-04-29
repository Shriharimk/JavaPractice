package BasicDSA;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        //Reverse  of linked list: https://www.youtube.com/watch?v=_cl3O4FBZh8
        //middle of ll https://www.youtube.com/watch?v=7LjQ57RqgEc&ab_channel=takeUforward

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(50);
        list.addLast(60);
        list.addLast(70);
        System.out.println(list);
        list.remove(list.size() - 1);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }    
}
