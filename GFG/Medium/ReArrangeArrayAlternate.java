package GFG.Medium;

import java.util.ArrayList;

public class ReArrangeArrayAlternate {
    static void rearrange(int a[], int n) {
        // code here
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0; i<n;i++){
            if(a[i]<0){
                neg.add(a[i]);
            }
            else if(a[i]>0){
                pos.add(a[i]);
            }
        }
        int countP = 0;
        int countN = 0;
        for(int i = 0; i<n; i++){
            if(i%2 ==0){
                a[i] = pos.get(countP);
                if(countP<pos.size()-1)
                    countP++;
            }else{
                a[i] = neg.get(countN);
                if(countN<pos.size()-1)
                    countN++;
            }
        }
        for(int i = 0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void rearrangeWithoutExtraSpace(int a[]){
        //First rearrange all neg and all posisitve - 2pointer method
        int i = 0, j = a.length - 1;
        while(i<j){
            while(i<=a.length && a[i]>0){
                i++;
            }            
            while(j>=0 && a[j]<0){
                j--;
            }
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }            
        }
        int k=0;
        while(k < a.length && i < a.length){
            int temp = a[k];
            a[k] = a[i];
            a[i] = temp;
            k+=2;
            i++;   
        }
        for(int p=0; p<a.length; p++){
            System.out.print(a[p]+" ");
        }

    }
    public static void main(String[] args) {
        int a[] = {9 ,4, -2 ,-1, 5, -5 ,-3, 2};
        // rearrange(a,a.length);
        rearrangeWithoutExtraSpace(a);
    }
    
}
