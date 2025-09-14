package GFG.Medium;

public class QuickSort {

    public static int partition(int a[], int l, int h){
        int i = l, j = h;
        int pivot = a[l];
        while(i<j){
            while(a[i] <= pivot){//increament i until a[i] > pivot
                i++;
            }
            while(a[j] > pivot){// decrement j until a[j] < pivot
                j--;
            }
            if(i<j){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        int temp = a[j];
        a[j] = a[l];
        a[l] = temp;
        return j;
    }

    public static void quickSort(int a[], int l, int h) {
        if(l<h){// terminating condition for the recurrsion. without this it will go in endless recursion  !!!!VVVVVVIMP
            int j = partition(a, l, h);
            quickSort(a,l,j);
            quickSort(a,j+1,h);
        }        
    }

    public static void main(String[] args) {
        int a[] = { 2,3,4,9,5,1};
        quickSort(a, 0, a.length-1);
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
