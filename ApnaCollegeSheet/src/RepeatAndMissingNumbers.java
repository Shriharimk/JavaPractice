import java.util.HashMap;
import java.util.Map;

public class RepeatAndMissingNumbers {

    /*
    Repeat and Missing Number Array | You are given a read only array of n integers from 1 to n.
     Each integer appears exactly once except A which appears twice and B which is missing.
     Return A and B. Note: Your algorithm should have a linear runtime complexity.
     Could you implement it without using extra memory? Note that in your output A should precede B.
     Example: Input:[3 1 2 5 3] Output:[3, 4] A = 3, B = 4
     */

    public static void main(String[] args) {
        int a[] =new int[]{
                3 ,1 ,2 ,5, 3
        };

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: a){
           map.put(i, map.getOrDefault(i,0)+1);
        }
        int missing = -1;
        for(int i=1;i<=a.length;i++){
            if(!map.containsKey(i)){
                missing = i;
            }
        }
        System.out.println(map);
        int repeat = -1;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                repeat = (entry.getKey());
            }
        }
        System.out.println(repeat);
        System.out.println(missing);
    }
}
