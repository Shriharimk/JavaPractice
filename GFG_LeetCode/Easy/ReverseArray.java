package GFG.Easy;

public class ReverseArray {

    public static void reverseArray(int a[]){
        int l =0; int h = a.length - 1;
        while(l<=h){
            int temp = a[l];
            a[l] = a[h];
            a[h] = temp;
            l++;
            h--;
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        reverseArray(a);
    }
    
}
