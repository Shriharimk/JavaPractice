package GFG.Medium;

public class MaxProdSubArray {

    public static void findMaxProdSubArray(int arr[]){
            int curProd = 1;
            int maxProd = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++){
                curProd = 1;
                curProd = curProd * arr[i];
                maxProd = Math.max(maxProd, curProd);

                for(int j = i+1; j< arr.length; j++){
                    curProd = curProd * arr[j];
                    if(curProd == 0){
                        break;
                    }
                    maxProd = Math.max(maxProd, curProd);
                }
            }
            System.out.println(maxProd);
    }
    public static void main(String[] args) {
        int a[] ={6 ,-5

        };
        findMaxProdSubArray(a);
    }
    
}
