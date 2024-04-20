package GFG.Medium;

public class KadaneAlgorithm {

    public static void maxSumSubArray(int a[]){
        int maxSum = 0;
        int currecntSum = 0;
        for(int i =0;i<a.length;i++){
            currecntSum = currecntSum+a[i];
            if(currecntSum < a[i]){  
                currecntSum = a[i]; // drop the previous sum
            }
            if(maxSum < currecntSum)
                maxSum = currecntSum;
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int a[] = {5,-4,-2,6,-1};
        maxSumSubArray(a);
    }
    
}
