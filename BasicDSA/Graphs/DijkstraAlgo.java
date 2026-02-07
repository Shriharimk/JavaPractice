package BasicDSA.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    public static int dks(int[][] items, int strt, int size){
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0;i<=size;i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge: items){
            int src = edge[0];
            int dest = edge[1];
            int wt = edge[2];
            graph.get(src).add(new int[]{dest,wt}); // in the adjacency list we are storing [destination, distance/time]
        }

        int[] distances = new int[size+1];
        Arrays.fill(distances,Integer.MAX_VALUE); // fill all the distances in the dis array with max possible values
        distances[strt] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->a[0]-b[0]);
        //in PQ, we are storing [distance, node]
        pq.add(new int[]{0,strt}); // adding string node in q, making its distance from itself 0

        //PQ FORMAT : [Dist, NOde]
        //GRAPH FORMAT: [NextNode, Dist]

        while ((!pq.isEmpty())){
            int[] current = pq.poll();
            int currentNodeDistance = current[0];
            int currentNode = current[1];

            //not the least distance/time path
            if(currentNodeDistance > distances[currentNode]) continue; // when later we get traversal path that is constlier

            //found better path
            for(int[] neighbor: graph.get(currentNode)){
                int nextNode = neighbor[0]; // next node
                int nextNodeWt = neighbor[1]; // distance/time to reach next node
                if(currentNodeDistance + nextNodeWt < distances[nextNode]){ //if currentTime/dist + nextNode ie if total
                    // of prev dist+next dist < distance for that next node from the distance array
                    distances[nextNode] = currentNodeDistance + nextNodeWt;
                    pq.add(new int[]{distances[nextNode],nextNode});
                }
            }
        }
        int ans = 0;
        for (int i = 1; i <= size; i++) {
            if (distances[i] == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, distances[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int [][] times = {
                {2,1,1},
                {2,3,1},
                {3,4,1}
        };
        int src = 2, dest =4;
        System.out.println(dks(times, src,dest));
    }
}
