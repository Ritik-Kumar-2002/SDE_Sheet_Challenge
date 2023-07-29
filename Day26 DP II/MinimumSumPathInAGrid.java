class Solution {

    public int MinPathSum (int [][] grid, int i, int j, int [][] dp){
        int N = grid.length;
        int M = grid[0].length; 
        if(i == N-1 && j == M-1) return grid[i][j];
        if(i >= N || j >= M) return Integer.MAX_VALUE;

        if(dp[i][j] != -1) return dp[i][j];
        return dp[i][j] = grid[i][j] + Math.min(MinPathSum(grid, i+1, j, dp), MinPathSum(grid, i, j+1, dp));

    }
    public int minPathSum(int[][] grid) {
        
        int N = grid.length;
        int M = grid[0].length; 
        int [][] dp = new int[N][M];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        }
        return MinPathSum(grid, 0, 0, dp );
    }
}