package GFG.Easy;

import java.util.HashMap;

public class FrequencyInArray {
    public static void main(String[] args) {
        int a[] ={ 1,1,1,2,2,3,3,5,6,4,4};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<a.length;i++){
            map.put(a[i],map.getOrDefault(a[i],0)+1);
        }
        System.out.println("frequency: "+map);

        //Similarly for freq of character in String 
        String s = "Hello world";
        HashMap<Character,Integer> charMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            charMap.put(s.charAt(i),charMap.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println("Freq in STring: "+charMap);
    }
    
}
