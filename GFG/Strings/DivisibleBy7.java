package GFG.Strings;

import java.util.Scanner;

public class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String num = in.next();
        System.out.println(isDivisibleBy7(num));
    }

    private static boolean isDivisibleBy7(String num) {
        System.out.println(num);
        int number = Integer.parseInt(num);
        if(number < 0) return isDivisibleBy7('-'+num);
        return true;
    }
    
}
