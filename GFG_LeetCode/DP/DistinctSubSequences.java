package GFG.DP;

import java.util.HashMap;

public class DistinctSubSequences {

    public static int distinctSubSequences(String s){
        //dp array of size string length+1
        int dp[] = new int[s.length()+1];
        dp[0] = 1;// to account for the empty subsequence
        //to track which character was considered at which index
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =1; i<dp.length; i++){
            char c = s.charAt(i-1);
            dp[i] = 2*dp[i-1];
            if(map.containsKey(c)){
                // get the index when it was considered
                int index = map.get(c);

                // subtract from the current total number of subsequnces possible,
                // the total possible subseq before that character was added
                dp[i] = dp[i] - dp[index-1]; 
            }
            map.put(c,i);
        }
        return dp[dp.length-1];

    }
    public static void main(String[] args) {
        String s = "abcbac";
        System.out.println(distinctSubSequences(s));
    }
    
}
