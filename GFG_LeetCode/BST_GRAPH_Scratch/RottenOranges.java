package GFG.BST_GRAPH_Scratch;

import java.util.LinkedList;
import java.util.Queue;

class RottenOranges {
    public int orangesRotting(int[][] grid) {
        int rowSize = grid.length;
        int colSize = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;

        //go on adding the postiion of the rotten oranges in the q

        for(int i=0;i<rowSize;i++){
            for(int j=0;j<colSize;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                }else if(grid[i][j]==1){
                    freshCount++;
                }
            }
        }
        int time=0;

        while(!q.isEmpty()){
            boolean freshFoundInLevel = false;
            int size = q.size();

            // this loop is needed to consider all the rotting oranges in a particular level.
            // initially, the queue has all the rotten oranges' positions this would mean the rotting
            // would start from all these points simultaneously
            for(int s= 0;s<size;s++){
                int[] currentNode = q.poll();
                int currentRow = currentNode[0];
                int currentCol = currentNode[1];

                for(int i=-1;i<=1;i++){
                    for(int j=-1;j<=1;j++){
                        if(Math.abs(i)+Math.abs(j) !=1) continue;

                        int nextRow = currentRow+i;
                        int nextCol = currentCol+j;

                        if(nextRow>=0 && nextCol>=0 &&
                                nextRow<rowSize && nextCol<colSize &&
                                grid[nextRow][nextCol] == 1){
                            grid[nextRow][nextCol] = 2;
                            q.add(new int[]{nextRow,nextCol});
                            freshCount--;
                            freshFoundInLevel = true;
                        }
                    }
                }
            }

            if(freshFoundInLevel){
                time++;
            }
        }

        return freshCount==0?time:-1;

    }

    public static void main(String[] args) {
        int[][] a = new int[][]{
                {1,2}
        };
        System.out.println(new RottenOranges().orangesRotting(a));
    }
}
