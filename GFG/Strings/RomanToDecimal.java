package GFG.Strings;

public class RomanToDecimal {

    public static int value(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToDecimal(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int a1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int a2 = value(s.charAt(i + 1));
                if (a2 >= a1) {
                    res = res + a2 - a1;
                    i++;
                } else if (a1 >= a2) {
                    res = res + a1;
                }

            }
            else res = res + a1;
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "XIX";
        System.out.println(romanToDecimal(s));
    }

}
