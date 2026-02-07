package GFG.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class uniqueEmailAddresses {

    public static void findSameEmail(String[] emails){
        HashSet<String> set = new HashSet<>();
        for(String name: emails){
            set.add(process(name));
        }
        System.out.println(set.size());
    }

    public static String process(String name){
        String temp = "";
        for(int i =0;i<name.length();i++){
            if((name.charAt(i) =='@') || (name.charAt(i) == '+')) break;
            if(name.charAt(i) == '.') continue;
            temp+=name.charAt(i);
        }
        temp+= name.substring(name.indexOf('@'), name.length()-1);
        System.out.println(temp);
        return temp;

    }

    public static void main(String[] args) {
        String emails[] = new String[]{
                "test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"
        };
        findSameEmail(emails);
    }
}
