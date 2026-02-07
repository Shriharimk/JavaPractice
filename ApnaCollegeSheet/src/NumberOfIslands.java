
class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int landCount = 0;
        int rowSize = grid.length;
        int colSize = grid[0].length;
        for(int i=-1;i<=1;i++){
            for(int j=-1;j<=1;j++){
                System.out.println((int)grid[i][j]);
                if((int)(grid[i][j])==1){
                    landCount++;
                    dfs(grid,i,j);
                }
            }
        }
        // int finalAns = islandCount(grid,0,0,landCount);
        return landCount;
    }

    public void dfs(char[][] grid, int row, int col){
        int rowSize = grid.length;
        int colSize = grid[0].length;

        if(row <0 || col <0 || row>rowSize || col>colSize) return;

        //mark current as visited
        grid[row][col] = '0';

        dfs(grid,row-1,col);
        dfs(grid,row+1,col);
        dfs(grid,row,col-1);
        dfs(grid,row,col+1);
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };
        NumberOfIslands n = new NumberOfIslands();
        System.out.println(n.numIslands(grid));
    }
}
