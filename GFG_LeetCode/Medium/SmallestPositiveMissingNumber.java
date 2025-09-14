package GFG.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class SmallestPositiveMissingNumber {
    static int missingNumber(int arr[], int size) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < size; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int i =1; i <=max; i++){
            if(map.get(i)==null){
                return i;
            }
        }
        return size+1;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
       System.out.println( missingNumber(a, a.length));
    }

}
