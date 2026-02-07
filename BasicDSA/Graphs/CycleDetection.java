package BasicDSA.Graphs;


import java.util.List;

import static BasicDSA.Graphs.GraphsDemo.createGraph;

public class CycleDetection {

    public static boolean dfs(List<List<Integer>> graph, int current, int parent, boolean[] visited){
        visited[current] = true;

        for(int i = 0; i< graph.get(current).size();i++){
            int next = graph.get(current).get(i);
            if(!visited[next]) {
                if (dfs(graph, next, current, visited)) return true; // if the next hasnt been visited yet then
                // call the dfs on the next node. If during that dfs on the child node there is a cycle and that returns
                //true then we send it back the stack while backtracking.

            }else if(next != parent){ // next has been visited and that is not a parent
                    return true;
                }
            }

        return false;

    }

    public static void main(String[] args) {
        int edges[][] = {
                {0,1},
                {1,2},
                {2,3},
                {3,0}
        };
        int V = 4;
        boolean[] visited = new boolean[V];
        List<List<Integer>> graph = createGraph(V,edges);
        for(int i =0 ; i< V;i++){
           System.out.println(dfs(graph,i,-1,visited)); //root doesnt have parent
        }

    }
}
