package BasicDSA.Graphs.utilities;

import BasicDSA.Graphs.graphDemoAdjacencyListEdge;

import java.util.ArrayList;

public class Edge {
    int src;
    public int dest;

    public Edge(int s, int d){
        this.src = s;
        this.dest = d;
    }

    public static ArrayList<Edge>[] createGraph(ArrayList<Edge> graph[]){
        for(int i= 0; i< graph.length;i++){
            graph[i] = new ArrayList<>();
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
        return graph;
    }
}
