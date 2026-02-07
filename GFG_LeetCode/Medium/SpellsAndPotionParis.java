package GFG.Medium;


import java.util.Arrays;

class SpellsAndPotionParis {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
//        int count[] = new int[spells.length];
//        Arrays.sort(potions);
//        for(int i = 0;i< spells.length;i++){
//            int cnt = 0;
//            for(int j =0 ;j< potions.length;j++){
//                int prod = potions[j]*spells[i];
//                if(prod>=success){
//                    int temp = potions.length-j;
//                    count[i]=temp;
//                    break;
//                }
//            }
//        }
//        return count;

        int count[] = new int[spells.length];
        Arrays.sort(potions);
        for(int i = 0;i< spells.length;i++){
            int index = potions.length;
            int l=0,r=potions.length-1;
            while(l<=r){
                int mid = (l+r)/2;
                if((potions[mid]*spells[i]) <= success){
                    r = mid-1;
                    index = mid;
                }else{
                    l = mid+1;
                }
            }
            int temp = potions.length -  index;
            count[i] = temp;

        }
        return count;

    }

    public static void main(String[] args) {
        int a[] = new int[]{3,1,2};
        int b[] = new int[]{8,5,8};
        System.out.println(new SpellsAndPotionParis().successfulPairs(a,b,16));
    }
}
