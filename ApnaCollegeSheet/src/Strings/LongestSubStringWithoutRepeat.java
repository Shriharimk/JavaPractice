package Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LongestSubStringWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        List<String> subArrayList = new ArrayList<>();
        String temp="";
        for(int i=0;i<s.length();i++){
            if(temp.indexOf(s.charAt(i)) != -1){ //repeat found
                subArrayList.add(temp);
                temp="";
                continue;
            }
            temp+=s.charAt(i);
        }
        Collections.sort(subArrayList, Comparator.comparing(String::length));
        return subArrayList.get(subArrayList.size()-1).length();

    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestSubStringWithoutRepeat l = new LongestSubStringWithoutRepeat();
        System.out.println(l.lengthOfLongestSubstring(s));
    }
}
