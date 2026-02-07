import java.util.ArrayList;
import java.util.Arrays;

class MergeOverLappingInterval {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<int[]> finalList = new ArrayList<>();
        Arrays.sort(arr,(a, b)->a[0]-b[0]);

        for(int[] currentInterval : arr){
            //If merged list is empty OR current interval does not overlap with
            // last merged interval
            if(finalList.isEmpty()|| finalList.get(finalList.size()-1)[1]<currentInterval[0]){
                finalList.add(currentInterval);
            }else{
                finalList.get(finalList.size()-1)[1] =
                        Math.max(finalList.get(finalList.size()-1)[1],currentInterval[1]);
            }
        }
        return finalList;
    }
}

// class Solution {
//     public ArrayList<int[]> mergeOverlap(int[][] inputIntervals) {
//         ArrayList<int[]> mergedIntervalsList = new ArrayList<>();

//         // Step 1: Sort intervals by start time
//         Arrays.sort(inputIntervals, (intervalOne, intervalTwo) -> intervalOne[0] - intervalTwo[0]);

//         // Step 2: Iterate through all intervals
//         for (int[] currentInterval : inputIntervals) {
//             // If merged list is empty OR current interval does not overlap with last merged interval
//             if (mergedIntervalsList.isEmpty() || mergedIntervalsList.get(mergedIntervalsList.size() - 1)[1] < currentInterval[0]) {
//                 mergedIntervalsList.add(currentInterval);
//             } else {
//                 // Overlap found -> merge by extending the end of the last merged interval
//                 mergedIntervalsList.get(mergedIntervalsList.size() - 1)[1] =
//                     Math.max(mergedIntervalsList.get(mergedIntervalsList.size() - 1)[1], currentInterval[1]);
//             }
//         }

//         return mergedIntervalsList;
//     }
// }
