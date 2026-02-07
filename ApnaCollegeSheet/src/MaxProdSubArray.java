class MaxProdSubArray {


    // https://www.youtube.com/watch?v=hnswaLJvr6g


    // public int maxProduct(int[] nums) {
    //     int maxProd = 1;
    //     int currentProd = 1;
    //     for(int i=0;i<nums.length;  i++){
    //         currentProd *= nums[i];
    //         if(currentProd <0 || nums[i]==0) currentProd = 1;
    //         maxProd = Math.max(currentProd,maxProd);
    //     }
    //     return maxProd;

    // }
    public int maxProduct(int[] a){
        int n = a.length;
        int prefix =1, sufix =1;
        int max =Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(prefix==0) prefix =1;
            if(sufix==0) sufix =1;
            //product from start to i
            prefix *= a[i];
            //product from end to i
            sufix *= a[n-i-1];
            max = Math.max(max, Math.max(prefix,sufix));
        }
        return max;
    }

    public static void main(String[] args) {
        int a[] = new int[]{
                -2,0,-1
        };
        MaxProdSubArray m = new MaxProdSubArray();
        System.out.println(m.maxProduct(a));
    }
}
