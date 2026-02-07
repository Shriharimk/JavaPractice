package Strings;

import java.util.Stack;

class ValidParanthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length()<=1) return false;
        for(int i =0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='(' || c=='{' || c== '[') st.push(c);
            else if(c==')' || c=='}' || c== ']'){
                char stChar = st.pop();
                if(c==')' && stChar == '(') continue;
                if(c=='}' && stChar == '{') continue;
                if(c==']' && stChar == '[') continue;
                else return false;
            }
        }
        return true;

    }
}
