package GFG.Medium;

import java.util.HashSet;

public class TripletSum {

    public static int findTripletSum(int[] a, int sum, int n) {
        int curSum = 0;
        for(int i= 0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            curSum = sum -a[i];
            for(int j = i+1;j<n;j++){
                int third = curSum - a[j];;
                if(set.contains(third)){
                    return 1;
                }
                set.add(a[j]);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] A = { 1, 4, 45, 6, 10, 8 };
        int sum = 13;
        int arr_size = A.length;
        System.out.println(findTripletSum(A, sum,arr_size)==1?true:false);
    }
    
}
