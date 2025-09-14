package GFG.Medium;

public class StockSpanProblem {
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int temp[] = new int[n];
        for(int i = n-1; i>=0;i--){
            int count = 1;
            for(int j = i-1;j>=0;j--){
                if(price[j]<=price[i]){
                    count++;
                }else{
                    break;
                }
            }
            temp[i] = count;            
        }
        for(int i = 0; i<n; i++){
            System.out.print(temp[i] + " ");
        }
        return temp;
    }
    
    public static void main(String[] args) {
        int a[] = { 100, 80, 60, 70, 60, 75, 85};
        calculateSpan(a, a.length);
    }
    
}
