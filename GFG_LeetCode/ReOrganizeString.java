package GFG;

import java.util.HashMap;
import java.util.PriorityQueue;

class ReOrganizeString {
    public String reorganizeString(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(char c:s.toCharArray()){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> maxHeap = new PriorityQueue<>((a, b)->freqMap.get(b) - freqMap.get(a));
        maxHeap.addAll(freqMap.keySet());
        StringBuilder str = new StringBuilder();

        while(maxHeap.size() >=2){
            //take 2 of the most frequent characters
            char c1 = maxHeap.poll();
            char c2 = maxHeap.poll();

            str.append(c1);
            str.append(c2);

            freqMap.put(c1,freqMap.get(c1)-1);
            freqMap.put(c2,freqMap.get(c2)-1);

            if (freqMap.get(c1) > 0) maxHeap.add(c1);
            if (freqMap.get(c2) > 0) maxHeap.add(c2);
        }

        if(!maxHeap.isEmpty()){
            char temp = maxHeap.poll();
            if(freqMap.get(temp) >1) return ""; //more than 1 is left after placing others
            str.append(temp);
        }
        return str.toString();


    }

    public static void main(String[] args) {
        System.out.println(new ReOrganizeString().reorganizeString("aaabc"));
    }
}
