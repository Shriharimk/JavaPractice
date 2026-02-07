package BasicDSA.Graphs;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// User function Template for Java
class ShortestPathInDirectedAcyclicGraph {

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        // 1. topological sort
        // 2. distance array

        List<List<int[]>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            adj.get(edge[0]).add(new int[]{edge[1],edge[2]});
        }
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                topoSort(adj,i,st,visited);
            }
        }
        System.out.println(st);
        return new int[]{0,0};
    }

    public void topoSort(List<List<int[]>> adj, int src, Stack<Integer> stack, boolean[] visited){
        visited[src] = true;

        for(int i=0;i<adj.get(src).size();i++){
            int next = adj.get(src).get(i)[0];
            if(!visited[next]){
                topoSort(adj,next,stack,visited);
            }
        }
        stack.push(src);
    }

    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 2},
                {0, 2, 1}
        };
        System.out.println(Arrays.toString(new ShortestPathInDirectedAcyclicGraph().shortestPath(4, 3, arr)));
    }
}
