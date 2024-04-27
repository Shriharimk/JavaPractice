package GFG.Medium;

import java.util.HashMap;

public class SubArrayWithSum0 {

    public static boolean subArrayWithSum0(int a[]){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            sum = 0;
            sum = sum+a[i];
            for(int j = i+1;j<a.length; j++){
                sum = sum + a[j];
                if(sum == 0){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean subArrayWithSumHash(int a[]){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0;
        map.put(0,0);
        for(int i = 0; i < a.length; i++){
            sum+= a[i];
            if(map.containsKey(sum)){
                return true;
            }else{
                map.put(sum,1);
            }
        }
        System.out.println(map);
        if(map.containsKey(0)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int a[] = {4 ,2 ,-3 ,1 ,6};
        System.out.println(subArrayWithSum0(a)? "Yes": "No");
        System.out.println(subArrayWithSumHash(a)? "Yes": "No");
    }
    
}
