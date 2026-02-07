package GFG.Medium;

class Stringcompression {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<chars.length;i++){
            int count = 0;
            char ch = chars[i];
            while(i<chars.length && chars[i]==ch){
                count++;
                i++;
            }
            if(count>1){
                sb.append(ch);
                sb.append(count);
            }else{
                sb.append(ch);
            }

        }
        for (int j = 0; j < sb.length(); j++) {
            chars[j] = sb.charAt(j);
        }

        return sb.length();
    }

    public static void main(String[] args) {
        System.out.println(new Stringcompression().compress(new char[]{'a','a','b','b','c','c','c'}));
    }
}
