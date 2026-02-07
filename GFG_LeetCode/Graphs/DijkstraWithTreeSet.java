package GFG.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class DijkstraWithTreeSet {

    public static void dijkstra(int[][] times, int size, int start) {
        // Step 1: Build graph adjacency list
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= size; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : times) {
            graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
        }

        // Step 2: Initialize distances
        int[] distance = new int[size + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        // Step 3: Use TreeSet (distance, node)
        TreeSet<int[]> set = new TreeSet<>(
                (a, b) -> {
                    if (a[0] == b[0]) return a[1] - b[1];
                    return a[0] - b[0];
                }
        );
        set.add(new int[]{0, start});

        // Step 4: Process nodes
        while (!set.isEmpty()) {
            int[] setElement = set.pollFirst();
            int currentTotalDistance = setElement[0];
            int currentNode = setElement[1];

            for (int[] nextNode : graph.get(currentNode)) {
                int neighbor = nextNode[0];
                int distanceToNextNode = nextNode[1];
                int totalDistanceToNext = currentTotalDistance + distanceToNextNode;

                if (totalDistanceToNext < distance[neighbor]) {
                    if (distance[neighbor] != Integer.MAX_VALUE) {
                        set.remove(new int[]{distance[neighbor], neighbor});
                    }
                    distance[neighbor] = totalDistanceToNext;
                    set.add(new int[]{totalDistanceToNext, neighbor});
                }
            }
        }

        // Step 5: Print results
        int ans = 0;
        for (int i = 1; i < distance.length; i++) {
            if (distance[i] == Integer.MAX_VALUE) {
                System.out.println("-1 (unreachable node " + i + ")");
                return;
            }
            ans = Math.max(ans, distance[i]);
        }
        System.out.println("Network Delay Time: " + ans);
    }

    public static void main(String[] args) {
        int[][] times = new int[][]{
                {2, 1, 1},
                {2, 3, 1},
                {3, 4, 1}
        };
        int n = 4;
        int k = 2;
        dijkstra(times, n, k);
    }
}
