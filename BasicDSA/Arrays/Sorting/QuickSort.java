//package BasicDSA.Arrays.Sorting;
//
//public class QuickSort {
//    public static int partition(int[] a,int l, int h){
//        int i=l; int j=h;
//        int pivot = a[l];
//        while(i<j){
//            while(i<=h && a[i]<=pivot){ // go on increasing i until element is greater than pivot
//                i++;
//            }
//            while(j>=l && a[j]> pivot){ //  go on decreasing j until element is less than pivot
//                j--;
//            }
//            if(i<j){ // dont swap i becomes greater than j that mean pivot position is found
//                int temp = a[i];
//                a[i] = a[j];
//                a[j] = temp;
//            }
//        }
//        int temp = a[l];
//        a[l] = a[j];
//        a[j] = temp;
//
//        return j;
//    }
//
//    public static void quickSort(int[] a, int l, int h){
//        if(l<h){
//            int m = partition(a,l,h);
//            quickSort(a,0,m);
//            quickSort(a,m+1,a.length-1);
//
//        }
//    }
//
//    public static void main(String[] args) {
//        int a[] =new int[]{
//                9,8,7,5,2,1
//        };
//        quickSort(a,0,a.length-1);
//        for(int i: a){
//            System.out.println(i);
//        }
//    }
//}

package BasicDSA.Arrays.Sorting;

public class QuickSort {
    public static int partition(int[] a, int l, int h) {
        int pivot = a[l];
        int i = l;
        int j = h;

        while (i < j) {
            // move i right until a[i] > pivot
            while (i <= h && a[i] <= pivot) {
                i++;
            }
            // move j left until a[j] < pivot
            while (j >= l && a[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;

        return j;
    }

    public static void quickSort(int[] a, int l, int h) {
        if (l < h) {
            int m = partition(a, l, h);
            quickSort(a, l, m - 1);  // left side
            quickSort(a, m + 1, h);  // right side
        }
    }

    public static void main(String[] args) {
        int a[] = {9, 8, 7, 5, 2, 1};
        quickSort(a, 0, a.length - 1);

        // print sorted array
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

