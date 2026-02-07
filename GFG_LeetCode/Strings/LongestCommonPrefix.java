package GFG.Strings;


// https://www.youtube.com/watch?v=bl8ue-dTxgs

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String arr[]){
        if(arr.length == 0) return "-1";
        String common = arr[0];
        for(int i = 1; i< arr.length; i++){// loop thru the array of strings
            while(arr[i].indexOf(common)!=0){ // loop until the substring is not found in the
                common = common.substring(0, common.length()-1); //reduce common string by 1
            }
        }
        if(common.length()>0) return common;
        else return "-1";
    }
    public static void main(String[] args) {
        String s[] = { "geeks", "geek",
            "geezer","geeksforgeeks"};
        System.out.println(longestCommonPrefix(s));
    }
    
}
