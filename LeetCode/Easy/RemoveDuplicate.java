package LeetCode.Easy;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static int removeDuplicates2(int[] nums) {
        int count = 0;
        for (int i: nums){
            if(count<2 || i!=nums[count-2]){
                nums[count++] = i;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 1, 2, 2, 3 };
        // removeDuplicates(nums);
        System.out.println(removeDuplicates2(nums));
    }

}
