package GFG.Medium;


import java.util.ArrayList;

class TriangulationSumOfArray {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;

        while(n>1){
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<n-1;i++){
                a.add((nums[i]+nums[i+1])%10);
            }
            --n;
            nums = a.stream()
                    .mapToInt(Integer::intValue) // or .mapToInt(i -> i)
                    .toArray();
        }
        return nums[0];
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        System.out.println(new TriangulationSumOfArray().triangularSum(a));
    }
}
