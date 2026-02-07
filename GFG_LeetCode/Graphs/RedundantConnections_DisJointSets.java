package GFG.Graphs;

public class RedundantConnections_DisJointSets{

    public static int find(int a, int[] parent){
        if(parent[a] != a){
            parent[a] = find(parent[a],parent);
        }
        return parent[a];
    }

    public static boolean union(int a,int b, int[] parent, int[] ranks){
        int pa = find(a,parent);
        int pb = find(b,parent);

        if(pa == pb){
            return false; // this means both a and b are in the same set
        }
        else if(ranks[pa] > ranks[pb]){
            parent[pb] = pa;
        } else if (ranks[pb]>ranks[pa]) {
            parent[pa] = pb;
        }else{
            //both of same rank so can be added to either
            parent[pb] = pa;
            ranks[pa]++;
        }
        if(ranks[pa] > ranks[pb]){
            parent[pb] = pa;
        }else if(ranks[pa] < ranks[pb]){
            parent[pa] = pb;
        }else{
            parent[pb] = pa;
            ranks[pa]++;
        }
        return true;
    }

    public static void main(String[] args) {
        int edges[][] = {
                {1,2},
                {2,3},
                {3,1}
        };
        int n = edges.length;
        int[] parent = new int[n+1];
        int[] ranks = new int[n+1];
        for(int i =1; i<=n;i++){
            parent[i] = i;
            ranks[i] = 1;
        }

        for(int[] edge: edges){
            int src = edge[0];
            int dest = edge[1];
            if(!union(src,dest,parent,ranks)){
                System.out.println(edge[0]+","+edge[1]);
                break;
            }
        }
    }

}