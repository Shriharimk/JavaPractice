package GFG.Easy;

import java.util.Scanner;

public class SubArrayWithGivenSum {

    public static int subArrayWithGivenSum(int a[], int x){
        for(int i = 0;i<a.length;i++){
            int sum = 0;
            sum = sum + a[i];
            for(int j = i+1;j<a.length;j++){
                sum  = sum + a[j];
                if(sum == x){
                    System.out.println(i + " to " + j);
                    return 0;
                }
            }
        }
        System.out.println("Not Possible");
        return -1;
    }

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("enter the array elements ");
        for(int i = 0; i < a.length; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Enter the required subArray ");
        int subArray = in.nextInt();
        subArrayWithGivenSum(a, subArray);
        in.close();
    }
    
}
