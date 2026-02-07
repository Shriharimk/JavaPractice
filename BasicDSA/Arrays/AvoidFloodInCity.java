package BasicDSA.Arrays;

import java.util.HashMap;
import java.util.TreeSet;

class AvoidFloodInCity {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] res = new int[n];
        HashMap<Integer, Integer> lastRain = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) { // adding indexes of 0 in hashmap
                dryDays.add(i);
                res[i] = 1; // default, may change later
            } else {
                int lake = rains[i];
                res[i] = -1;

                if (lastRain.containsKey(lake)) {
                    // find a dry day > lastRain[lake]
                    Integer dryDay = dryDays.higher(lastRain.get(lake));
                    if (dryDay == null) return new int[0]; // impossible
                    res[dryDay] = lake; // dry this lake
                    dryDays.remove(dryDay);
                }

                lastRain.put(lake, i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int [] res = new AvoidFloodInCity().avoidFlood(new int[]{1,2,0,0,2,1});
    }
}
