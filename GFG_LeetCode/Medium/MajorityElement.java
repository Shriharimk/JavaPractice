package GFG.Medium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int getMajorityElement(int a[]){
        int size = a.length;
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: a){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>= size/2)
                return entry.getKey();
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] ={3 ,1 ,3 ,3 ,2};
        getMajorityElement(a);
    }
    
}
