package GFG.Easy;

public class PalindromeString {

    public static void checkPalindrome(String s) {
        StringBuffer str = new StringBuffer(s);
        System.out.println(str.reverse());
        if(str.reverse().toString().equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args) {
        String s = "racecar";
        checkPalindrome(s);
    }
    
}
