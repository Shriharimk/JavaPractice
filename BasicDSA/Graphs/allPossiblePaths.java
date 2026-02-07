package BasicDSA.Graphs;

import BasicDSA.Graphs.utilities.*;

import java.util.ArrayList;

import static BasicDSA.Graphs.utilities.Edge.createGraph;


public class allPossiblePaths {

    public static void printAllPath(ArrayList<Edge> graph[], int src, int dest){
        boolean visited[]= new boolean[graph.length];
        String path ="";
        dfs(graph,visited,src,"0",dest);
    }

    public static void dfs(ArrayList<Edge> graph[], boolean visited[],int current, String path,int target){
        if(current == target) {
            System.out.println(path);
            return;
        }
        for(int i =0; i< graph[current].size();i++){
            if(!visited[graph[current].get(i).dest]) {
                visited[current] = true;
                path = path + graph[current].get(i).dest;
                dfs(graph,visited,graph[current].get(i).dest,path,target);
                visited[current] = false;
            }
        }
    }


    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[7];
        graph = createGraph(graph);
        printAllPath(graph,0,5);

    }
}
