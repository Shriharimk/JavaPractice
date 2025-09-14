package BasicDSA;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        map.put("India",120);
        map.put("USA",100);
        map.put("China",100);
        map.put("Germany",100);
        map.put("Japan",100);
        System.out.println(map);
        map.put("India",200);
        System.out.println(map);

        //Searching
        //1.get method
        System.out.println(map.get("India"));

        //2.containsKey method
        System.out.println(map.containsKey("India"));

        //3.containsValue method
        System.out.println(map.containsValue(100));

        //4.isEmpty method
        System.out.println(map.isEmpty());

        //5.keySet method
        System.out.println(map.keySet());

        //6.values method- get all the values present in the map
        System.out.println(map.values());

        //7.entrySet method
        System.out.println(map.entrySet());

        //Iteration over HashMap
        System.out.println("Iteration over HashMap");
        System.out.println("Usign entry");
        for(Map.Entry<String,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Using for each");
        map.forEach((key, value) ->{
            System.out.println("Key:" +key+ " Value:" + value);
        });
        System.out.println();
        System.out.println("Only keys");
        map.values().forEach((value) ->{
            System.out.println( " Value:" + value);
        });

        //Removing
        //1.remove method
        System.out.println("Removing");
        map.remove("India");
        System.out.println(map);

        System.out.println("Size:"+map.size());

    }
    
}
