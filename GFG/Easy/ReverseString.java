package GFG.Easy;

public class ReverseString {

    public static String reverseString(String s){
        String temp = "";
        for(int i = s.length()-1; i >= 0; i--){
            temp = temp + s.charAt(i);
        }
        return temp;
    }
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
    
}
