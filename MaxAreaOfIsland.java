class Solution {
    private static int search(int r, int c, int row, int col, int[][] grid){

        /*for every grid[r][c]==1 this function will be called from maxAreaOfIsland and this function 
        search both horizontally and vertically for the presence of 1. 
        And returns the total count of it.*/

        if(r>=row || c>=col){
            return 0;
        }

        grid[r][c]=0;
        int count = 1;

        if(r<row-1 && grid[r+1][c]==1){
            count+=search(r+1,c,row,col,grid);
        }

        if(r>0 && grid[r-1][c]==1){
            count+=search(r-1,c,row,col,grid);
        }

        if(c>0 && grid[r][c-1]==1){
        count += search(r,c-1,row,col,grid);
        }

        if(c<col-1 && grid[r][c+1]==1){
        count += search(r,c+1,row,col,grid);
        }
        
        return count;   
    }

    public int maxAreaOfIsland(int[][] grid) {

        /*This function searches for 1 in the grid array and if found then calls search function
        to search in 4 direction*/
        
        int maxArea =0;
        int row = grid.length;
        int col=grid[0].length;

        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){

                if(grid[i][j]==1){

                    int area = search(i,j,row,col,grid);

                    if(area>maxArea){
                        maxArea=area;
                    }
                }
            }
        }
        return maxArea;
    }
}
