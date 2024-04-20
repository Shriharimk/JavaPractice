package GFG.Easy;

import java.util.HashSet;

public class UnionAndIntersectionArrays {

    public static void union(int a[],int b[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i: a){
            set.add(i);
        }
        for(int i: b){
            set.add(i);
        }
        System.out.println("Union: "+set);
    }

    public static void intersection(int a[], int b[]){
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        for(int i: a){
            setA.add(i);
        }
        for(int i: b){
            setB.add(i);
        }
        HashSet<Integer> setC = new HashSet<>();
        for(int i: setA){
            if(setB.contains(i)){
                setC.add(i);
            }
        }
        System.out.println("Intersection: "+setC);

    }

    public static void main(String[] args) {
        int a[] = {1,1,1,2,2,3,4,5};
        int b[] = {1,1,1,2,2,3,4,5,6,7};
        union(a,b);
        intersection(a,b);
    }
    
}
