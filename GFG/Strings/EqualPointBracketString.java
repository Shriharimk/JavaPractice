package GFG.Strings;

public class EqualPointBracketString {

    public static int countSub(String str) {
        int l = 0, r = str.length()-1;
        while(l<r){
            //increment l until u find a closing bracket
            while(str.charAt(l)!='(' && l<r) l++;
            //go on decrementing r till u find an opening bracket
            while(str.charAt(r)!=')' && l<r) r--;
            if(l<r){
                l++;
                r--;
            }
        }
        if(l==r && str.charAt(l)=='(') return l;
        if(l>r) return l;
        return l+1;


    }
    public static void main(String[] args) {
        String s = "()";
        System.out.println(countSub(s));
    }
    
}
