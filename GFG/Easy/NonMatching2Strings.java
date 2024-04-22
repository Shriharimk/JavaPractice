package GFG.Easy;

import java.util.HashSet;

public class NonMatching2Strings {

    // this approach will work perfectly the only issue being since it uses 3 hasSets, its not very space efficient
    public static void getNonMatchingChars(String s1, String s2) {  
        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> set2 = new HashSet<Character>();
        HashSet<Character> set3 = new HashSet<Character>();
        for(int i =0; i< s1.length(); i++){
            set1.add(s1.charAt(i));
        }
        for(int i =0; i< s2.length(); i++){
            set2.add(s2.charAt(i));
        }
        for(char c: set1){
            if(!set2.contains(c)){
                set3.add(c);
            }
        }
        for(char c: set2){
            if(!set1.contains(c)){
                set3.add(c);
            }
        }
        System.out.println(set3);
    }
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "geeksquiz";
        getNonMatchingChars(s1,s2);
    }
    
}
