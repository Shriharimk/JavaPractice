import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


//https://www.youtube.com/watch?v=DhFh8Kw7ymk

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        if(n<3) return Collections.emptyList();
        List<List<Integer>> finalList = new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j =i+1;
            int k = n-1;
            while(j < k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum >0){
                    k--;
                }else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    finalList.add(temp);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                }
            }

        }
        return finalList;


    }

    public static void main(String[] args) {
        int a[] = new int[]{
                -1,0,1,2,-1,-4
        };
        ThreeSum t= new ThreeSum();
        System.out.println(t.threeSum(a));
    }
}
