package Strings;
class PalindromicSubString {
    public int countSubstrings(String s) {

        int paliCount =0;
        for(int i=0;i<s.length();i++){
            int l = i, r = i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                paliCount++;
                l--;
                r++;
            }
            l = i; r = i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                paliCount++;
                l--;
                r++;
            }
        }
        return paliCount;

    }
}
