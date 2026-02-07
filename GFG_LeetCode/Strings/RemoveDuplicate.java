package GFG.Strings;

class RemoveDuplicate {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int count = 0;
        for(int i =1; i< nums.length-1; i++){
            if(nums[i]!=nums[i+1]){
                System.out.println(temp[count]);
                temp[count] = nums[i];
                count++;
            }
        }
        return temp.length;
    }

    public static void main(String[] args) {
        System.out.println("*"+new RemoveDuplicate().removeDuplicates(new int[]{
                1,1,2
        }));
    }
}
