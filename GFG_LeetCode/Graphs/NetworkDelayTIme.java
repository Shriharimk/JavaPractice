package GFG.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;



//DIJKSTRA'S ALGO WITH PRIORITY QUEUE

class NetworkDelayTIme {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i = 0; i<=n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge: times){
            graph.get(edge[0]).add(new int[]{edge[1],edge[2]});
            //graph element: [neighborNode, distanceToNeighbor]
        }
        int[] distance = new int[n+1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[0]-b[0]);
        //priorityQueue element: [distanceUntilNow, currentNode]
        distance[k] = 0;
        pq.add(new int[]{0,k});

        while(!pq.isEmpty()){
            int currentQueueElement[] = pq.poll();
            int currentDistanceUntilNow = currentQueueElement[0];
            int currentNode = currentQueueElement[1];

            //traverse through the neighbors of the currentNode
            for(int[] neighbor: graph.get(currentNode)){
                int nextNode = neighbor[0];
                int nextNodeDistance = neighbor[1];
                int totalDistanceToNextNode = currentDistanceUntilNow+nextNodeDistance;
                if(totalDistanceToNextNode < distance[nextNode]){
                    distance[nextNode] = totalDistanceToNextNode;
                    pq.add(new int[]{totalDistanceToNextNode,nextNode});
                }
            }
        }
        int ans = 0;

        for(int i = 1; i<distance.length;i++){
            if(distance[i]== Integer.MAX_VALUE) return -1; //means vertext was unreachable
            System.out.println(distance[i]);
             ans = Math.max(distance[i], ans);
        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] times = new int[][]{
                {2,1,1},
                {2,3,1},
                {3,4,1}
        };
        int n = 4;
        int k = 2;
        System.out.println(new NetworkDelayTIme().networkDelayTime(times,n,k));
    }
}
