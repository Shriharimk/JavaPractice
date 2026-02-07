package GFG.Graphs;

import java.util.ArrayList;
import java.util.List;

public class AllPathsBWSrcTar {

    public static List<List<Integer>> createGraph(int V,int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i<V; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] edge: edges){
            int src = edge[0];
            int dest = edge[1];
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }
        return graph;
    }

    public static void findAllPathsSrcToTar(List<List<Integer>> graph, int current, boolean[] visited, int target, String path ){
        if(current == target){
            System.out.println(path);
            return;
        }

        for(int i = 0; i< graph.get(current).size();i++){
            int neighbor = graph.get(current).get(i);
            if(!visited[neighbor]){
                visited[neighbor] = true;
                findAllPathsSrcToTar(graph,neighbor,visited,target,path+neighbor);
                visited[neighbor] = false;
            }
        }
    }

    public static void main(String[] args) {
        int V =5;
        int edges[][] = {
                {0,1},
                {0,2},
                {1,3},
                {2,3},
                {3,4}
        };
        List<List<Integer>> graph = createGraph(V,edges);
        boolean[] visited = new boolean[V];
        String path= "3";
        visited[3] = true;
        findAllPathsSrcToTar(graph,3, visited, 0, path);
    }
}
