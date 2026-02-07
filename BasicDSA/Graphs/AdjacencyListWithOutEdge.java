package BasicDSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AdjacencyListWithOutEdge {

    static class Graph{
        int V;//total number of vertices
        List<List<Integer>> adj; //main adjacency list

        Graph(int V){
            this.V = V;
            adj = new ArrayList<>();
            for(int i = 0; i<V;i++){
                adj.add(new ArrayList<>());
            }
        }

        public static void insertVertex(Graph g,int src, int dest){
            g.adj.get(src).add(dest); // list of list. So it ll get src position and add dest to that list
            g.adj.get(dest).add(src);
            //if weighted, add that wt as well
        }

        public static List<Integer> getNeighbors(Graph g,int node){
            return g.adj.get(node);
        }

        public static void BFS(Graph g){
            boolean visited[] = new boolean[g.V];
            Queue<Integer> q = new LinkedList<>();
            q.add(0);
            while(!q.isEmpty()){
                int current = q.poll();
                if(!visited[current]){
                    System.out.println((current));
                    visited[current] = true;
                    for(int i = 0; i< g.adj.get(current).size();i++){
                        q.add(g.adj.get(current).get(i));
                    }
                }

            }
        }

        public static void main(String[] args) {
            Graph g = new Graph(4);
            insertVertex(g,0,1);
            insertVertex(g,1,2);
            insertVertex(g,1,3);
            insertVertex(g,2,3);
            for(int i=0;i<g.V;i++){
                System.out.println(i+" -> " +getNeighbors(g,i));
            }
            BFS(g);
        }
    }
}
