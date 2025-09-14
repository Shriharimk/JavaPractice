package GFG.Easy;

// import java.util.Arrays;

public class MaxMinArray {

    public static void findMinMax(int a[]){
        int n = a.length;
        //Arrays.sort(a);
        for(int i = 0;i<n;i++){
            for(int j = 0; j<n;j++){
                if(a[i]<a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("min: "+a[0]);
        System.out.println("max: "+a[n-1]);
    }
    public static void main(String[] args) {
        int a[] = {6,2,1,5,4,3};
        findMinMax(a);
    }
    
}
