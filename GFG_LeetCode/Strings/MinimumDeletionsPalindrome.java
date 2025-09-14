package GFG.Strings;

public class MinimumDeletionsPalindrome {
    static int funcCall(String S, int i, int j){
        if(i>=j){
            return 0;
        }
        if(S.charAt(i)==S.charAt(j)){
            return funcCall(S, i+1, j-1);
            
        }
        return 1+ Math.min(funcCall(S,i+1,j), funcCall(S,i,j-1));
    }
    
    static int minimumNumberOfDeletions(String S) {
        return funcCall(S, 0, S.length()-1);
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(minimumNumberOfDeletions(s));
    }
}
