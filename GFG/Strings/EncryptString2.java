package GFG.Strings;

public class EncryptString2 {

    public static String encryptString(String s) {
        StringBuilder str = new StringBuilder();

        for(int i =0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 0;
            while(i <s.length() && s.charAt(i)==c){
                count++;
                i++;
            }
            i--;
            String hexString = Integer.toHexString(count);
            str.append(s.charAt(i));
            str.append(hexString);
        }        
        str.reverse();
        return str.toString();
    }
    // //
    // HashMap<Character, Integer> map = new HashMap<>();
    //     for(int i = 0; i< s.length(); i++){
    //         map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
    //     }
    //     String temp = "";
    //     for(Map.Entry<Character, Integer> entry : map.entrySet()){
    //         temp = temp + entry.getKey() + Integer.toHexString(entry.getValue());
    //     }
    //     StringBuilder str = new StringBuilder(temp);
    //     str.reverse();
    //     return str.toString();
    public static void main(String[] args) {
        String s = "46825380952940387566759192377741543091298503733609277316566252309828249219715077227958716351611513559583656385107815886443524878343491989517149020528362734333180531849703437332514643018572082055442312687432813278771648079276010274654319590927997071178208821940526957027131022750169981983379341938941674979174380390410840974190986263952861201453694690697128336962457856078313692252243255008996151136955798257605029346076";
        System.out.println(encryptString(s));
    }
    
}
