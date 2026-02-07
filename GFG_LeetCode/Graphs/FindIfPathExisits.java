package GFG.Graphs;

import java.util.ArrayList;
import java.util.List;

class FindIfPathExisits {

    public List<List<Integer>> createGraph(int n , int[][] edges){
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0;i<n;i++){
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

    public boolean findIfPathExsists(List<List<Integer>> graph, int current, boolean[] visited, int target, String path){
        boolean temp = false;
        if(current == target){
            return true;
        }

        for(int i=0;i<graph.get(current).size();i++){
            int neighbor = graph.get(current).get(i);
            if(!visited[neighbor]){
                visited[neighbor]=true;
                if(findIfPathExsists(graph, neighbor, visited, target, path+neighbor))
                    return true;
            }
        }
        return false;
    }

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = createGraph(n,edges);
        boolean[] visited = new boolean[n];
        String path = ""+source;
        visited[source]=true;
        return findIfPathExsists(graph,source,visited,destination,path);
    }

    public static void main(String[] args) {
        FindIfPathExisits f = new FindIfPathExisits();
        int n = 3;
        int[][] edges = {
                {0,1},
                {0,2},
                {2,0}
        };
        System.out.println(f.validPath(3,edges,0,2));
    }


}
