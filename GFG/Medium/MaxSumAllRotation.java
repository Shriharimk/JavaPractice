package GFG.Medium;

import java.util.Arrays;

public class MaxSumAllRotation {

    public static void cyclicRotation(int a[], int k){
        if(k==0){
            return;
        }
        int lastElement = a[a.length-1];

        for(int i=a.length-1;i>0;i--){
            a[i] = a[i-1];
        }
        a[0] = lastElement;

        cyclicRotation(a,k-1);
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
    public static int maxSymAllRotation(int a[], int n){
	    // Your code here
	    int maxSum = 0;
	    
	    int sum = 0;
	    int k = 0;
	    int temp[] = new int[n];

        while(k<n){
            cyclicRotation(a, 1);
            System.out.println();
            sum = 0;
            for(int j = 0; j< n; j++){
                sum = sum + (a[j]*j);
            }
            temp[k] = sum;
            k++;
        }
	    Arrays.sort(temp);
	    return temp[temp.length-1];
    }
    public static void main(String[] args) {
        int a[] = { 8, 3, 1, 2 };
        System.out.println(maxSymAllRotation(a, a.length));
    }
}
