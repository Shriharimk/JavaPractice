package GFG.Medium;

public class CountingParis {

    public static void countPairs(int a[], int k){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]+a[j] == k)
                {
                    count++;
                }
            }   
        }
        System.out.println("no of paris: " + count);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        countPairs(arr,6);

    }
    
}
