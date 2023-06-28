class Solution {
    public int find_path(int row, int col, int m, int n, int [][] dp){
        if(row == m-1 && col ==n-1) return 1;
        if(row<0 || row==m || col < 0 || col == n) return 0;
        if(dp[row][col] != -1) return dp[row][col];
        int right = find_path(row, col+1, m, n, dp);
        int bottom = find_path(row+1, col, m, n, dp);
        return dp[row][col] = right+bottom;
    }
    public int uniquePaths(int m, int n) {
        int [][] dp = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++) dp[i][j] = -1;
        }
        return find_path(0, 0, m, n, dp);
    }
}