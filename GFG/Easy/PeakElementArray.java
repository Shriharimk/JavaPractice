package GFG.Easy;

public class PeakElementArray {

    public static int findPeak(int[] a){
        int n = a.length;
        if(a.length == 0){
            return 0;
        }

        if(a[n-2]<a[n-1]){
            return n-1;
        }

        for(int i = 1;i<n ; i++){
            if(a[i] >= a[i-1] && a[i] >= a[i+1]){ // checking for neighbhors if it is greater than neighboring then it is returned
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {    
        int a[] = {1,3,4,6,5};
        System.out.println(findPeak(a));       
    }
    
}
