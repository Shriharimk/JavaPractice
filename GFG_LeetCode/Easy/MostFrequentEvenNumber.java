package GFG.Easy;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenNumber {
    public static void main(String[] args) {
        int a[] = new int[]{
                0,0,0,0
        };
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int i: a){
                    if(i%2==0)
                        map.put(i,map.getOrDefault(i,0)+1);
                }
                System.out.println(map);
                if(map.isEmpty()) System.out.println(-1);;
                int key = -1;
                int maxValue = 0;
                for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                    if(entry.getValue()==0) continue;
                    if(entry.getValue() > maxValue){
                        key = entry.getKey();
                        maxValue = entry.getValue();
                    }
                }
        System.out.println(maxValue);;


    }
}
