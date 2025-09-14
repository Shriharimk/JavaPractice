package GFG.Strings;

import java.util.Scanner;

public class DecimalToRoman {

    public static String decimalToRoman(int number){
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC", "L","XL","X","IX","V","IV","I"};
        String temp = "";
        for(int i = 0; i<values.length; i++){
            while(number!=0 && number>=values[i]){
                temp += roman[i];
                number = number - values[i];
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(decimalToRoman(number));
        in.close();
    }
    
}
