package BasicDSA.Arrays;


    class RemoveDuplicatesFromArray {
        public int removeDuplicates(int[] nums) {
            int k = 2;
            int count = 0;
            for(int i=0;i< nums.length;i++){
                if(count < k || nums[count]!=nums[count-k]){
                    nums[count] = nums[i];
                    count++;
                }
            }
            return count;
        }

        public static void main(String[] args) {
            int a[] = new int[]{
                    1,1,1,2,2,3
            };
            RemoveDuplicatesFromArray r = new RemoveDuplicatesFromArray();
            r.removeDuplicates(a);
        }
    }

