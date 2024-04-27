package GFG.Strings;


// https://www.youtube.com/watch?v=bl8ue-dTxgs

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String arr[]){
        String common = arr[0];
        if(arr.length == 0) return "-1";
        for(int i = 1; i< arr.length; i++){
            while(arr[i].indexOf(common)!=0){
                common = common.substring(0, common.length()-1);
            }
        }
        if(common.length()>0) return common;
        else return "-1";
    }
    public static void main(String[] args) {
        String s[] = {"geeksforgeeks", "geeks", "geek",
            "geezer"};
        System.out.println(longestCommonPrefix(s));
    }
    
}
