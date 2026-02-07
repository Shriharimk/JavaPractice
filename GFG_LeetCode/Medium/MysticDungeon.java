package GFG.Medium;



class MysticDungeon {
    public int maximumEnergy(int[] energy, int k) {
        int n = energy.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum = energy[i];
            max = Math.max(sum, max);
            int j = i+k;
            if(j<n){
                sum+=energy[j];
                max = Math.max(sum, max);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new MysticDungeon().maximumEnergy(new int[]{-2,-3,-1},2));
    }
}
