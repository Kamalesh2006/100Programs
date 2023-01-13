class Solution {
    public static int paths(int i,int j,int m,int n,int[][] dp){
        if(i==m+1 || j==n+1){
            return 0;
        }
        else if(i==m&& j==n){
            dp[i][j]=1;
            return 1;
        }
        else if(dp[i][j]!=-1){
            return dp[i][j];
        }
        
        dp[i][j]=paths(i,j+1,m,n,dp)+paths(i+1,j,m,n,dp);
        return dp[i][j];

    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        /*for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0){
                    dp[i][j]=1;
                    continue;
                }
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
        */
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        return paths(0,0,m-1,n-1,dp);

        
    }
}
