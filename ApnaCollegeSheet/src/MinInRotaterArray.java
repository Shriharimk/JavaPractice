class MinInRotaterArray {
    // public int findMin(int[] nums) {
    //     Arrays.sort(nums);
    //     return nums[0];
    // }
    public int findMin(int[] a){
        int l=0, h=a.length-1;
        int ans = Integer.MAX_VALUE;
        while(l<=h){
            int mid = (l+h)/2;

            if(a[l]<=a[mid]){
                ans = Math.min(a[l],ans);
                l = mid+1;
            }else{
                ans = Math.min(a[mid],ans);
                h = mid-1;
            }
        }
        return ans;
    }
}
