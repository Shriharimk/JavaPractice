package GFG.Easy;

import java.util.Arrays;

public class KthSmallestandLargest {

    public static void kthSmallestandLargest(int[] a, int k) {
        Arrays.sort(a); 
        System.out.println(k+" st/nd/th Smallest: "+a[k-1]);
        System.out.println(k+" st/nd/th Largest: "+a[a.length-k]);
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6};
        kthSmallestandLargest(a, 2);// return 2nd smallest and 2nd largest values
    }
    
}
