package GFG.Medium;

import java.util.HashMap;

public class SubArraysWithEqual01 {
    public static void findlargestSubArraywithequal01(int a[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);//initally putting sum = 0 for -1 th index
        int sum = 0;
        int ans = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]== 0){
                sum+= -1;
            }else if(a[i]== 1){
                sum+= 1;
            }

            if(map.containsKey(sum)){
                int index = map.get(sum);//will give back the index when that same sum was added in the map
                int len = i-index;
                if(len> ans){
                    ans = len;
                }

            }else{
                map.put(sum,i);
            }
        }
        System.out.println(ans);
        
    }

    public static int countSubArrays(int a[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int sum = 0,ans = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                sum = sum + -1;
            else if(a[i]==1)
                sum = sum + 1;
            
            if(map.containsKey(sum)){
                ans = ans + map.get(sum);// map.get(sum) will return the frequency of that particular value of sum
                map.put(sum, map.get(sum)+1);
            }else
               map.put(sum,1);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int a[] = {0,0,1,0,1,0,1,1,0,0,1,1,1};
        System.out.println(countSubArrays(a));
    }
    
}
