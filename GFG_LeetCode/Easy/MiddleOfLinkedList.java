// package GFG.Easy;

// import BasicDSA.LinkedList;
// import BasicDSA.LinkedList.Node;

// public class MiddleOfLinkedList {

//     public static void findMidElement(LinkedList list) {
//         Node slow = list.head;
//         Node fast = list.head;
//         while(fast != null || fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         System.out.println("Middle: "+slow.data);
//     }
//     public static void main(String[] args) {
//         LinkedList list = new LinkedList();
//         list.addLast(10);
//         list.addLast(20);
//         list.addLast(30);
//         list.addLast(40);
//         list.addLast(50);
//         list.printList();
//         findMidElement(list);
//     }
    
// }


//using collections

package GFG.Easy;

import java.util.*;

public class MiddleOfLinkedList{

    public static void middle(LinkedList<Integer> list){
        int slow = 0;
        int fast = 0;
        while(fast < list.size() && fast + 1 < list.size()){
            slow++;
            fast += 2;
        }
        System.out.println("Middle: " + list.get(slow));
    }
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        middle(list);
    }
}