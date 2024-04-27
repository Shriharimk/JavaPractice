package GFG.Medium;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {
    public static void findFirstRepeatingElement(int a[]){
        int index = -1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    index = i;
                    break;
                }
            }
            if(index > -1){
                break;
            }
        }
        System.out.println(index+1);    
    }

    public static  int findRepeatingHash(int a[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: a){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i = 0; i< a.length; i++){
            if(map.get(a[i])>1){
                return i+1; 
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[] = {7, 4, 0, 9, 4, 8, 8, 2, 4, 5, 5, 1};
        // findFirstRepeatingElement(a);
        System.out.println(findRepeatingHash(a));
    }
    
}
