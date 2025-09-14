package GFG.Medium;

import java.util.HashSet;

public class IsSubSet {
    public static String issSubSet( int a1[], int a2[], int n, int m) {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        int count = 0;
        for(int i: a1){
            setA.add(i);
        }
        for(int i: a2){
            setB.add(i);
        }
        for(int i: setB){
            if(setA.contains(i)){
                count = 1;
            }else{
                count = 0;
                break;
            }
        }
        if(count>0)
            return "Yes";
        else return "No";
    }
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5, 6};
        int a2[] = {1,2,3,1};
        System.out.println(issSubSet(a1,a2,a1.length,a2.length));
    }
    
}
