class BestTimeToBuyStock {
    public int maxProfit(int[] a) {
        int min = Integer.MAX_VALUE;
        int n = a.length;
        if(n==0) return 0;
        if(n==2){
            if(a[0]>a[1]) return 0;
            else return a[1]-a[0];
        }
        for(int i=1;i<n;i++){
            if(a[i-1]>a[i]){
                min = Math.min(a[i],min);
            }
        }
        int minIndex = -1;
        for(int i=0;i<n;i++){
            if(a[i]==min){
                minIndex = i;
            }
        }
        if(minIndex == n-1) return 0; // cant buy
        // now only consider the array after this minindex to see which is the highest
        int max = Integer.MIN_VALUE;
        for(int i=minIndex+1;i<n;i++){
            if(a[i-1]<a[i]){
                max = Math.max(a[i],max);
            }
        }
        return max-min;
        // int maxIndex = -1;
        // for(int i=0;i<n;i++){
        //     if(a[i]==min){
        //         minIndex = i;
        //     }
        // }

    }

    public static void main(String[] args) {
        BestTimeToBuyStock b = new BestTimeToBuyStock();
        System.out.println(b.maxProfit(new int[]{1,2,4}));
    }
}
