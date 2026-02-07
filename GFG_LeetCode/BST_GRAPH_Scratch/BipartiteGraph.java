package GFG.BST_GRAPH_Scratch;

//Input: graph = [[1,2,3],[0,2],[0,1,3],[0,2]]
//Output: false
//Explanation: There is no way to partition the nodes into two independent sets such that every edge connects a node in one and a node in the other.

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class BipartiteGraph {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] visited = new int[n];
        Arrays.fill(visited, -1); // -1 = not colored, 0/1 = two colors

        for (int start = 0; start < n; start++) {
            if (visited[start] == -1) { // not visited, start a BFS
                Queue<Integer> q = new LinkedList<>();
                q.add(start);
                visited[start] = 0; // assign first color

                while (!q.isEmpty()) {
                    int current = q.poll();

                    for (int neighbor : graph[current]) {
                        if (visited[neighbor] == -1) {
                            visited[neighbor] = 1 - visited[current]; // opposite color
                            q.add(neighbor);
                        } else if (visited[neighbor] == visited[current]) {
                            return false; // conflict → not bipartite
                        }
                    }
                }
            }
        }

        return true;
    }
}
