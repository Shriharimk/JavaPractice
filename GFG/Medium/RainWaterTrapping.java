package GFG.Medium;

public class RainWaterTrapping {
    public static void findRainWaterTrapped(int a[]){
        int n = a.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = a[0];
        for(int i = 1; i<n;i++){
            left[i] = Math.max(left[i-1], a[i]);
        }
        right[n-1] = a[n-1];
        for(int i = n-2; i>=0;i--){
            right[i] = Math.max(right[i+1], a[i]);
        }
        int temp[] = new int[n];
        for(int i = 0; i<n; i++){
            temp[i] = Math.min(left[i], right[i]) - a[i];
        }
        int sum = 0;
        for(int i: temp){
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println("\n"+sum);
    }
    public static void main(String[] args) {
        int a[]= {3,0,0,2,0,4};
        findRainWaterTrapped(a);
    }
}
