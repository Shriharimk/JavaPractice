package GFG.Medium;

public class JumpGame2 {
    public static void findMinNumberOfJumps(int a[]){
        int coverage = 0;
        int lastJumpIndex = 0;
        int totalJumps = 0;
        int destination = a.length-1;
        if(a.length == 1){ System.out.println(0);return;}

        for(int i =0; i<a.length; i++){
            coverage = Math.max(coverage, i+a[i]);
            if(i == lastJumpIndex){
                lastJumpIndex = coverage;// this is to update the last jump index to max place the window will cover
                totalJumps++;
            }

            if(lastJumpIndex >= destination){
                System.out.println(totalJumps);
                return;
            }

        }
    }
    public static void main(String[] args) {
        int a[] = {2,4,1,2,3,1,1,2};
        findMinNumberOfJumps(a);
    }
    
}
