package GFG.Easy;

public class DutchNationalFlag {

    public static void swap(int a[], int l, int r){
        int temp = a[l];
        a[l] = a[r];
        a[r] = temp;
    }

    public static void sortArray(int a[]){
        int l=0, mid = 0, r = a.length-1;
        while(mid <= r){
            switch (a[mid]) {
                case 0: //if 0 then swap l and mid th elements
                    swap(a, mid, l);
                    mid++;
                    l++;
                    break;
                case 1: // if its 1 then increment mid
                    mid++;
                    break;
                case 2: // if its 2 then swap mid and r th elements
                    swap(a,mid,r);
                    r--;
                    break;
            }
        }
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,1,0,0,0,2,2,1,1,1};
        sortArray(a);
    }
}
