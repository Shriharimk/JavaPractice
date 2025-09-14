package GFG.Medium;

//https://www.youtube.com/watch?v=Gtugy3mRV-A

public class JumpGame1 {

    public static boolean canJump(int a[]){
        int finalPos = a.length-1;
        for(int i = a.length-2;i>=0;i--){
            if(a[i]+i >= finalPos){
                finalPos = i;
            }
        }
        return finalPos == 0;
    }
    public static void main(String[] args) {
        // int a[] = {3,2,1,0,4};
        int a[] = {1,1,2,5,2,1,0,0,1,3};
        System.out.println(canJump(a));
    }
    
}
