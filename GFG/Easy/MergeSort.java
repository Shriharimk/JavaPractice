package GFG.Easy;

public class MergeSort {

    public static void merge(int a[], int s, int mid, int e) {
        int idx1 = s; // to track index in first array
        int idx2 = mid + 1; // to track index in second array
        int x = 0; // to track index in merged array
        int merged[] = new int[e - s + 1];
    
        while (idx1 <= mid && idx2 <= e) {
            if (a[idx1] <= a[idx2]) {
                merged[x] = a[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = a[idx2];
                x++;
                idx2++;
            }
        }
    
        // Copy remaining elements from the first subarray (if any)
        while (idx1 <= mid) {
            merged[x] = a[idx1];
            x++;
            idx1++;
        }
    
        // Copy remaining elements from the second subarray (if any)
        while (idx2 <= e) {
            merged[x] = a[idx2];
            x++;
            idx2++;
        }
    
        // Copy merged array back into the original array
        for (int i = 0, j = s; i < merged.length; i++, j++) {
            a[j] = merged[i];
        }
    }
    

    public static void mergeSort(int a[],int s,int e) {
        if(s < e){
            int mid = s + (e-s)/2;
            mergeSort(a, s, mid);
            mergeSort(a, mid+1, e);
            merge(a,s,mid,e);
        }
    }

    public static void main(String[] args) {
        int a[] = {2,4,6,1,0,9};
        mergeSort(a,0,a.length-1);

        for(int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
    }
    
}
