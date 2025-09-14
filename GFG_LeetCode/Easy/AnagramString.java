package GFG.Easy;

import java.util.Arrays;

public class AnagramString {

    public static boolean checkAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for(int i=0; i<c1.length; i++){
            if(c1[i] != c2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "geeksforgeeks";
        String b = "forgeeksgeeks";
        System.out.println(checkAnagram(a,b));
    }
    
    
}
