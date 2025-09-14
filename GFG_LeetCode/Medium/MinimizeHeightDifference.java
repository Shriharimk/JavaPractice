package GFG.Medium;

import java.util.Arrays;

public class MinimizeHeightDifference {

    static int getMinDiff(int[] arr, int n, int k) {
       Arrays.sort(arr);
       int tempMin = arr[0];
       int tempMax = arr[n - 1];
       int ans = tempMax - tempMin;
       for(int i = 0; i < n; i++) {
        if(arr[i] - k <0) continue;
        //add k to awhole array that mmin will be tempMin
        tempMin = Math.min(arr[0] + k, arr[i] - k);

        //sub k from all elements in the array
        tempMax = Math.max(arr[i-1] + k, arr[n-1] - k);

        ans = Math.min(ans, tempMax - tempMin);
       }
       return ans;
    }
    public static void main(String[] args) {
        int a[] = { 7, 4, 8, 8, 8, 9 };
        System.out.println(getMinDiff(a, a.length, 7));

    }
    
}
