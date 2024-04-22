package GFG.Easy;

import java.util.HashMap;

public class NonMatchingCharString {

    public static void main(String[] args) {
        String s = "hello";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        for(int i=0; i<=map.size(); i++){
            if(map.get(s.charAt(i))<=1){
                System.out.println(s.charAt(i)+" repeats: "+map.get(s.charAt(i))+" times");
            }
        }
    }
    
}
