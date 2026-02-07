//https://www.youtube.com/watch?v=EbkMABpP52U


class ContainerOfWater {
    public int maxArea(int[] height) {
        // brute force

        // int maxArea = Integer.MIN_VALUE;
        int n = height.length;
        // for(int i=0; i< n; i++){
        //     for(int j =i+1; j<n;j++){
        //         int width = j-i;
        //         int ht = Math.min(height[j],height[i]);
        //         int currentArea = width*ht;
        //         maxArea = Math.max(currentArea, maxArea);
        //     }
        // }
        // return maxArea;

        int l =0, r = n-1;
        int maxArea = Integer.MIN_VALUE;
        while(l<r){
            int wt = r-l;
            int ht = Math.min(height[r],height[l]);
            int area = ht*wt;
            maxArea = Math.max(area, maxArea);
            if(height[l]<height[r]){
                l++;
            }else r--;
        }
        return maxArea;

    }
}
