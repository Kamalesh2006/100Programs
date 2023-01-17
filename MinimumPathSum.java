class Solution {
    public static int minSum(int r,int c, int row, int col,int[][]grid,int[][] dp){
        if(r>row  || c> col){
            return Integer.MAX_VALUE;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        if(r==row && c==col){
            return grid[r][c];
        }
        int right = minSum(r,c+1,row,col,grid,dp);
        int down = minSum(r+1,c,row,col,grid,dp);
        dp[r][c]=grid[r][c]+Math.min(right,down);
        return dp[r][c];
    }
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col=grid[0].length;
        /*for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0 && j==0){
                    continue;
                }
                if(i==0 && j!=0){
                    grid[i][j]= grid[i][j]+grid[i][j-1];
                }
                else if(i!=0 && j==0){
                    grid[i][j]=grid[i][j]+grid[i-1][j];
                }
                else{
                    grid[i][j]= Math.min(grid[i][j]+grid[i-1][j],grid[i][j]+grid[i][j-1]);
                }

            }
        }*/
        int[][] dp= new int[row][col];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        return minSum(0,0,row-1,col-1,grid,dp);
    }
}
