package GFG.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {
    public static void findDuplicate(int a[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for(int i: a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                duplicates.add(entry.getKey());
            }
        }
        System.out.println(duplicates);
    }
    public static void main(String[] args) {
        int a[] = { 1,1,1,2,3,4,4};
        findDuplicate(a);
    }
    
}
