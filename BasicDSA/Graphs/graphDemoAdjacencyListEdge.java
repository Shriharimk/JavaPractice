package BasicDSA.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphDemoAdjacencyListEdge {

    static class Edge{
        int src;
        int dest;

        Edge(int s,int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,3));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,5));
        graph[3].add(new Edge(3,4));
        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,5));
        graph[4].add(new Edge(4,2));

        graph[5].add(new Edge(5,6));
        graph[5].add(new Edge(5,3));
        graph[5].add(new Edge(5,4));

        graph[6].add(new Edge(6,5));

    }

    public static void BFSEdge(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length]; //visited array length same as the number of vertices
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(graph[0].get(0).src); // or directly add the first number q.add(0);
        while(!q.isEmpty()){
            int currentNode = q.poll();
                if(!visited[currentNode]){
                    System.out.print(currentNode+ " -> ");
                    visited[currentNode] = true;
                    for(int j = 0 ; j<graph[currentNode].size();j++){
                        q.add(graph[currentNode].get(j).dest);
                    }
                }
        }

    }

    public static void DFSEdge(ArrayList<Edge> graph[], int current, boolean visited[]){
            System.out.print(current + " -> ");
            visited[current]=true;
            for(int i=0;i<graph[current].size();i++){
                if(!visited[graph[current].get(i).dest]) {
                    DFSEdge(graph, graph[current].get(i).dest, visited);
                }
            }
//        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[7];
        createGraph(graph);

        for(int i = 0; i< graph.length; i++){
            System.out.println("\nNode: "+ i);
            for(int j = 0;j<graph[i].size();j++) {
                Edge e = graph[i].get(j);
                System.out.print("\nSrc: " + e.src);
                System.out.print(" Dest: " + e.dest);
            }
        }

        System.out.println("\nBFS Traversa\n");
        BFSEdge(graph);

        System.out.println("\nDFS traversal\n");
        boolean visited[] = new boolean[graph.length];
        DFSEdge(graph,0,visited);
    }
}
