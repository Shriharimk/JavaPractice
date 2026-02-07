package BasicDSA.Graphs;


import java.util.*;

class TopologicalSorting {
    static List<Integer> temp = new ArrayList<>();
    public static ArrayList<Integer> topoSortDFS(int V, int[][] edges) {
        // DFS
        boolean visited[] = new boolean[V];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]); // u -> v
        }
        Stack<Integer> s = new Stack<>();
        for(int i =0;i<V;i++){
            if(!visited[i])
                dfs(i,adj,visited,s);
        }

        ArrayList<Integer> list = new ArrayList<>();
        while(!s.isEmpty()){
            int currentTop = s.pop();
            list.add(currentTop);
        }
        return list;
    }

    public static void dfs(int srcNode,List<List<Integer>> adj,
                           boolean[] visited, Stack<Integer> stack){
        visited[srcNode] = true;
        for(int i=0;i<adj.get(srcNode).size();i++){ //all neighbors of srcNode
            int currentNode = adj.get(srcNode).get(i);
            if(!visited[currentNode]){
                dfs(currentNode,adj,visited,stack);
            }
        }
        stack.push(srcNode);
        temp.add(srcNode);
    }

    //BFS Kahns algo
    public static ArrayList<Integer> topoSortBFS(int V, int[][] edges) {
     List<List<Integer>> adj =new ArrayList<>();
     for(int i=0;i<V;i++){
         adj.add(new ArrayList<>());
     }

     for(int[] edge:edges){
         int src =edge[0];
         int dest = edge[1];
         adj.get(src).add(dest);
     }

     int[] indegree = new int[V];
     for(int i=0;i<V;i++){
         for(int it:adj.get(i)){
             indegree[it]++;
         }
     }

     Queue<Integer> q = new LinkedList<>();
     for(int i=0;i<V;i++){
         if(indegree[i]==0){
             q.add(i);
         }
     }
     ArrayList<Integer> res = new ArrayList<>();

     while(!q.isEmpty()){
         int currentNode = q.poll();
         res.add(currentNode);


         for(int i=0;i<adj.get(currentNode).size();i++){
             int nextNode = adj.get(currentNode).get(i);
             indegree[nextNode]--;
             if(indegree[nextNode]==0){
                 q.add(nextNode);
             }

         }
     }
     return res;

     }

    public static void main(String[] args) {
        System.out.println("dfS:");
        System.out.println(topoSortDFS(4,new int[][]{{3, 0}, {1, 0}, {2, 0}}));
        System.out.println(topoSortBFS(4,new int[][]{{3, 0}, {1, 0}, {2, 0}}));
        System.out.println(temp.reversed());
    }
}
