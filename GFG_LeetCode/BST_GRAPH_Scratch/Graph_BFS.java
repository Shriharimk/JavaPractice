package GFG.BST_GRAPH_Scratch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph_BFS {

    public static void bfs(int[][] edges,int start){
        List<List<Integer>> adj = new ArrayList<>();

        //since they havent provided us the total number of vertices, we need to fins the vertex with the max number
        int maxNode = 0;
        for (int[] edge : edges) {
            maxNode = Math.max(maxNode, Math.max(edge[0], edge[1]));
        }
        int n = maxNode + 1;


        int[] visited = new int[n];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            visited[i] =0;
        }

        for(int[] edge: edges){
            int src = edge[0];
            int dest = edge[1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = 1;
        result.add(start);

        while (!q.isEmpty()){
            int currentNode = q.poll();


            for(int i=0;i<adj.get(currentNode).size();i++) {
                int next = adj.get(currentNode).get(i);
                if (visited[next]!=1){
                    q.add(next);
                    visited[next]=1;
                    result.add(next);
                }
            }
        }

        for(int i: result){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int[][] edges = new int[][]{
                {0, 1}, {0, 2}, {1, 3}, {2, 4}
        };
        bfs(edges,0);
    }
}
