package GFG.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class MinDistance {
    
    static int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int minDistance = 0;
        for(int i = 0; i< s.size(); i++){
            if(s.get(i) == word1){
                for(int j = i+1; j< s.size(); j++){
                    if(s.get(j)==word2){
                        if(minDistance == 0){
                            minDistance = j-i;
                        }else{
                            minDistance =Math.min(minDistance,j-i);
                        }
                    }
                }
            }            
        }
        return minDistance;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("the", "quick", "brown", "fox" ,"quick"));
        String word1 = "the";
        String word2 = "fox";
        System.out.println(shortestDistance(list,word1,word2));

    }
    
}
