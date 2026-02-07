
class ProducOfItself {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int sufix[] = new int[n];

        prefix[0] = 1;
        for(int i =1;i<n;i++){
            prefix[i] = prefix[i-1]*nums[i-1];
        }
        System.out.print("prefix:\n ");

        for(int i: prefix){
            System.out.print(i);
        }
        sufix[n-1] = 1;
        System.out.print("\nsufix: \n");

        for(int i =n-2;i>=0;i--){
            sufix[i] = sufix[i+1]*nums[i+1];
        }
        for(int i: sufix){
            System.out.print(i);
        }

        int ans[] = new int[n];
        for(int i=0;i<n;i++){
            ans[i] = prefix[i]*sufix[i];
        }
        return ans;
    }
}