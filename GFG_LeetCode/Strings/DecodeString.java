package GFG.Strings;

class DecodeString {
        static int currentIndex = 0;

        public static String decodeString(String s) {
            StringBuilder sb = new StringBuilder();
            while(currentIndex<s.length() && s.charAt(currentIndex) != ']'){ // if ] then exit that particula rrecurrsion
                char c = s.charAt(currentIndex);
                if(currentIndex<s.length() && Character.isDigit(c)){ // if current is digit then after
                    // taht there maybe more disgits eg: 12[ab] form the repeat string
                    int repeat = 0;
                    //first isDigit will only guarantee the first part of the 2 digit or 3 digit number
                    // is a digit not the trailing charactoers after that so we beed to loop from
                    // that index until we get a letter
                    while(currentIndex<s.length() && Character.isDigit(s.charAt(currentIndex))){
                        repeat =  repeat*10 + (s.charAt(currentIndex)-'0');
                        currentIndex++;
                    }

                    currentIndex++; // to skip the  '['
                    String subString = decodeString(s);
                    currentIndex++; // to skip ']'
                    for(int i=0;i<repeat;i++){
                        sb.append(subString);
                    }
                }else{
                    sb.append(c);
                    currentIndex++;
                }
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }
    }

