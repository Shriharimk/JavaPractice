package GFG.Medium;

import java.util.HashSet;

public class CommonElelemtsIn3Arrays {

    public static void findCommonElelemts(int a[], int b[], int c[]){
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        HashSet<Integer> setC = new HashSet<>();
        for(int i: a){
            setA.add(i);
        }
        for(int i: b){
            setB.add(i);
        }
        for(int i: c){
            setC.add(i);
        }
        for(int i: setA){
            if(setB.contains(i)){
                if(setC.contains(i)){
                    System.out.print(i+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = {2, 3, 4, 5, 6, 7};
        int c[] = {3, 4, 5, 6, 7, 8};
        findCommonElelemts(a, b, c);
    }
    
}
