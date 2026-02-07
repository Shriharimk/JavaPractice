package GFG.BST_GRAPH_Scratch;


import java.util.LinkedList;
import java.util.Queue;

//https://www.youtube.com/watch?v=hy6aAittY9Q
class DetectCycleIn2DArrayBFS {
    public boolean containsCycle(char[][] grid) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        int[][] visited = new int[rowSize][colSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                visited[i][j]= 0;
            }
        }

        for(int i=0; i<rowSize; i++){
            for(int j=0; j<colSize; j++){
                if(visited[i][j]!=1){
                    if(bfs(i,j,grid,visited))
                        return true;
                }
            }
        }
        return false;
    }

    boolean bfs(int srow, int scol, char[][] grid, int[][] visited){
        int rowSize = grid.length;
        int colSize = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{srow,scol,-1,-1}); //initially parent of source is -1,-1
        visited[srow][scol] = 1;

        while(!q.isEmpty()){
            int current[] = q.poll();
            int currentRow = current[0];
            int currentCol = current[1];
            int parentRow = current[2];
            int parentCol = current[3];

            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){
                    if(Math.abs(i)+Math.abs(j)!=1) continue;

                    int nextRow = currentRow+i;
                    int nextCol = currentCol+j;

                    if(nextRow>=0 && nextCol>=0
                            && nextRow<rowSize && nextCol<colSize
                            && grid[nextRow][nextCol]==grid[currentRow][currentCol]){
                        //if visited is true and nextrow/col is not its parent then its been visited by someone else, so cylce exists
                        if (visited[nextRow][nextCol] == 1) {
                            // cycle if neighbor already visited and not parent
                            //basically next node is trying to visited an already visited node
                            // bsically that node is being visited by some other node that is not the parent node
                            if (!(nextRow == parentRow && nextCol == parentCol)) {
                                return true;
                            }
                        } else {
                            visited[nextRow][nextCol] = 1;
                            q.add(new int[]{nextRow, nextCol, currentRow, currentCol});
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] c = new char[][] {
                {'a','a','a','a'},
                {'a','b','b','a'},
                {'a','b','b','a'},
                {'a','a','a','a'}
        };
        System.out.println(new DetectCycleIn2DArrayBFS().containsCycle(c));
    }
}
