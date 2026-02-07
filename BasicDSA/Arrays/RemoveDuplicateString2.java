package BasicDSA.Arrays;

import java.util.Stack;

class RemoveDuplicateString2 {

        static class Node{
            char c;
            int freq;
            Node(char c, int freq){
                this.c = c;
                this.freq = freq;

            }
        }

        public static String removeDuplicates(String s, int k) {
            Stack<Node> st = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(!st.isEmpty()) {
                    Node stackPeek = st.peek();
                    if (stackPeek.c == s.charAt(i)) {
                            Node stElement = st.pop();
                            stElement.freq++;
                            st.push(stElement);
                    }
                }else {
                    st.push(new Node(s.charAt(i), 1));
                }

                if(!st.isEmpty() && st.peek().freq==k) {
                    st.pop();
                }
            }
            StringBuilder sb =new StringBuilder();
            while(!st.isEmpty()){
                Node stElement = st.pop();
                while(stElement.freq>0){
                    sb.append(stElement.c);
                    stElement.freq--;
                }
            }
            return sb.reverse().toString();
        }

        public static void main(String[] args) {
            String s = "deeedbbcccbdaa";
            System.out.println(removeDuplicates(s,3));
        }
    }

