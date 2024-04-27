package GFG.Strings;

public class ReverseWords {
    public static void reverseWords(String s){
        String[] words = s.split("\\.");
        int l = 0, h = words.length-1;
        while(l<=h){
            String temp = words[l];
            words[l] = words[h];
            words[h] = temp;
            l++;
            h--;
        }
        for(int i=0; i<words.length; i++) {
            System.out.print(words[i]+".");
        }
    }
    public static void main(String[] args) {
        String s = "i.like.this.program.very.much";
        reverseWords(s);
    }
    
}
