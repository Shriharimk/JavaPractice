package BasicDSA;

import java.util.LinkedList;
public class MiddleLinkedList {
    public static int middleOfLinkedList(LinkedList<Integer> list){
        int slow = 0, fast = 0;
        while(fast < list.size() && fast < list.size()-1){
            slow++;
            fast += 2;
        }
        return list.get(slow);
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(50);
        list.addLast(50);
        list.addLast(60);
        System.out.println(list);
        System.out.println(middleOfLinkedList(list));
    }
    
}
