package GFG.Medium;

public class CyclilcalRotationArray {

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

    }

    public static void main(String[] args) {
        int a[] ={1, 3, 5, 7, 9};
        cyclicRotation(a,4);
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
