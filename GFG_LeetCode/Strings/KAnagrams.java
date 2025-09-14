package GFG.Strings;

import java.util.HashMap;

public class KAnagrams {

    public static boolean isKAnagrams(String s1, String s2, int k){
        if(s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        for(int i = 0; i< s1.length(); i++){
            map1.put(s1.charAt(i), map1.getOrDefault(s1.charAt(i),0)+1);
        }
        System.out.println(map1);
        for(int i = 0; i< s2.length(); i++){
            if(map1.getOrDefault(s2.charAt(i),0) > 0){
                map1.put(s2.charAt(i), map1.get(s2.charAt(i))-1);
            }
        } 
        System.out.println(map1);

        int count = 0;
        for(char c:map1.keySet()){
            count+= map1.get(c);
        }
        if(count <=k){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        String s1 = "fodr";
        String s2 = "gore";
        System.out.println(isKAnagrams(s1, s2, 1));
    }
}
