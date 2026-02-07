package BasicDSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphsDemo {

    public static List<List<Integer>> createGraph(int size, int[][] edges){
        List<List<Integer>> adj = new ArrayList<>();

        for(int i = 0; i< size; i++){
            adj.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int src = edge[0];
            int dest = edge[1];
            adj.get(src).add(dest);
            adj.get(dest).add(src);
        }
        return adj;
    }

    public static void bfs(List<List<Integer>> graph, int start){
        boolean[] visited = new boolean[graph.size()];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int current = q.poll();
            visited[current] = true;
            System.out.print(current+ " -> ");

            for(int i =0; i< graph.get(current).size(); i++){
                int edge = graph.get(current).get(i);
                if(!visited[edge]){
                    visited[edge]=true;
                    q.add(edge);
                }
            }
        }
    }

    public static void dfs(List<List<Integer>> graph, int current, boolean[] visited){
        System.out.print(current + " -> ");
        visited[current] = true;
        for(int i = 0; i< graph.get(current).size();i++){
            int edge = graph.get(current).get(i);
            if(!visited[edge])
                dfs(graph,edge,visited);
        }

    }

    public static void main(String[] args) {
        int n = 5; // number of nodes (0 to 4)
        int[][] edges = {
                {0, 1},
                {0, 2},
                {1, 3},
                {2, 4}
        }; // this is an edge list
        List<List<Integer>> graph = createGraph(n,edges);
        boolean[] visited = new boolean[n];
        System.out.println("DFS: ");
        dfs(graph,0,visited);
        System.out.println("\nBFS: ");
        bfs(graph,0);
    }
}
