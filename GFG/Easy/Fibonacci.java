package GFG.Easy;

import java.util.Scanner;

public class Fibonacci {

    public static int fib(int limit){
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+" "+b+" ");
        for(int i=0;i<limit;i++){
            c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c; 
        }
        return c;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the limit ");
        int limit = in.nextInt();
        System.out.println("\nLast: "+fib(limit));
        in.close();
    }
}
