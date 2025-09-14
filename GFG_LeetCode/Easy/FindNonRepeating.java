package GFG.Easy;

import java.util.HashMap;

public class FindNonRepeating {
    public static int findNonRepeatingElement(int a[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.println(map);
        for(int i = 0; i< a.length; i++){
            if(map.get(a[i])==1){
                return i; 
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int a[] = {4, -8, 1, -4, -3, -8, -3, -10, 3, -3, 10};
        System.out.println(findNonRepeatingElement(a));
    }
    
}
