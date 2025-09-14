package GFG.Strings;

import java.util.HashMap;

public class AreIsoMporphic {

    public static boolean areIsomorphic(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        for(int i = 0; i< s1.length(); i++){
            if(map.containsKey(s1.charAt(i))){
                char previousValue = map.get(s1.charAt(i));
                if(previousValue != s2.charAt(i)){
                    return false;
                }
            }else if(!map.containsValue(s2.charAt(i))){
                map.put(s1.charAt(i), s2.charAt(i));
            }else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "xxz";
        System.out.println(areIsomorphic(s1,s2));
    }
    
}
