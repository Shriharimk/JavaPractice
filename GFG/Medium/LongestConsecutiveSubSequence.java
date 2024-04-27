package GFG.Medium;

import java.util.HashMap;

public class LongestConsecutiveSubSequence {
    static int findLongestConseqSubseq(int arr[], int n) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        int maxSeqStartingPoint = 0;
        int maxSeqLength = 0;
        // initially initiallize each value in the array to true
        for (int i : arr) {
            map.put(i, true);
        }
        System.out.println(map);

        // update value of each based on whether its previous element is present in the
        // map
        for (int i : arr) {
            if (map.containsKey(i - 1)) {
                map.put(i, false);
            }
        }
        System.out.println(map);

        // now consider only those whose value is true

        for (int i : arr) {
            if (map.get(i) == true) {
                int tempStartingPoint = i;
                int tempLength = 1;

                while (map.containsKey(tempStartingPoint + tempLength)) {
                    tempLength++;
                }

                if (maxSeqLength < tempLength) {
                    maxSeqStartingPoint = tempStartingPoint;
                    maxSeqLength = tempLength;
                }

            }
        }
        return maxSeqLength;
    }

    public static void main(String[] args) {
        int a[] = { 2, 6, 1, 9, 4, 5, 3};
        System.out.println(findLongestConseqSubseq(a, a.length));
    }
}
