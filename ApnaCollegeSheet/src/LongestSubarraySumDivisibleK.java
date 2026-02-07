// User function Template for Java

import java.util.ArrayList;
import java.util.List;

class LongestSubarraySumDivisibleK {
    int longestSubarrayDivK(int[] arr, int k) {
        // Complete the function
        List<Integer> finalList = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum += arr[j];
                if(sum%k == 0){
                    for(int l = i;l<=j;l++){
                        finalList.add(arr[l]);
                    }
                }
            }
        }
        return finalList.size();
    }

    public static void main(String[] args) {
        int a[] = new int[]{
                2, 7, 6, 1, 4, 5
        };
        LongestSubarraySumDivisibleK l = new LongestSubarraySumDivisibleK();

        System.out.println(l.longestSubarrayDivK(a,3));
    }
}

