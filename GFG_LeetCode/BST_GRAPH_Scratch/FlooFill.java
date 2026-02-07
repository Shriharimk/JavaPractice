package GFG.BST_GRAPH_Scratch;



//https://www.youtube.com/watch?v=aehEcTEPtCs

import java.util.LinkedList;
import java.util.Queue;

class FlooFill {
    boolean isSafe(int row, int col, int rowSize, int colSize){
        return (row>=0 && col >=0 && row<rowSize && col<colSize);
    }

    //Using BFS

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color) return image;

        // dfs(image,sr,sc,image[sr][sc],color);

        int n = image.length;
        int m = image[0].length;
        Queue<int[]> q = new LinkedList<>();
        int prevColor = image[sr][sc];
        image[sr][sc] = color;
        q.add(new int[]{sr,sc});

        while(!q.isEmpty()){
            int[] currentNode = q.poll();
            int currentRow = currentNode[0];
            int currentCol = currentNode[1];

            for(int i=-1;i<=1;i++){
                for(int j=-1;j<=1;j++){

                    if(Math.abs(i) + Math.abs(j) != 1) continue;

                    int nextRow = currentRow+i;
                    int nextCol = currentCol+j;
                    if(isSafe(nextRow,nextCol,n,m) && image[nextRow][nextCol] == prevColor){
                        image[nextRow][nextCol] = color;
                        q.add(new int[]{nextRow, nextCol});
                    }
                }
            }
        }
        return image;

    }

    //using DFS

//    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//        // if(image[sr][sc]==color) return image;
//
//        dfs(image,sr,sc,image[sr][sc],color);
//        return image;
//
//    }

    void dfs(int image[][], int row, int col, int prevColor, int newColor){
        if(prevColor==newColor) return;
        if(row<0 || col<0 || row>=image.length || col >= image[0].length || image[row][col]!=prevColor) return;

        image[row][col] = newColor;

        dfs(image, row-1, col, prevColor, newColor);
        dfs(image, row+1, col, prevColor, newColor);
        dfs(image, row, col-1, prevColor, newColor);
        dfs(image, row, col+1, prevColor, newColor);
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{
                {1,1,1},
                {1,1,0},
                {1,0,1}
        };
        image = new FlooFill().floodFill(image,0,0,2);
        for(int[] row: image){
            for(int i: row){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
//  0 1 2   new  = 2
//0 [2,2,2],
//1 [2,2,0],
//2 [2,0,1]


