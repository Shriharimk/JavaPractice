package GFG.Strings;

import java.util.HashMap;

public class Panagram {

    public static boolean isPanagram(String S){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String s = S.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i<alphabet.length(); i++){
            char c = alphabet.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);
        for(int i = 0; i< s.length(); i++){
            if(map.getOrDefault(s.charAt(i),0)>0){
                map.put(s.charAt((i)), map.get(s.charAt(i))-1);
            }
        }
        System.out.println(map);
        int count = 0;
        for(char c: map.keySet()){
            count+= map.get(c);
        }
        if(count ==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the dog";
        System.out.println(isPanagram(s));
    }
    
}
