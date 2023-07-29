class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length, m = image[0].length;
        int [][] dp = new int[n][m];
        int [][] vis = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++) dp[i][j] = image[i][j];
        }
        int existcolor = dp[sr][sc];
        vis[sr][sc] = 1;
        dp[sr][sc] = color;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(sr, sc));

        int [] delrow = {-1, 0, +1, 0};
        int [] delcol = {0, +1, 0, -1};
        // System.out.println("exist color "+existcolor);
        while(!queue.isEmpty()){
            Pair p = queue.remove();
            int row =p.row;
            int col =p.col;
            for(int i=0; i<4; i++){
                int nrow = delrow[i] + row;
                int ncol = delcol[i] + col;
                if(nrow >=0 && nrow < n && ncol >=0 && ncol < m 
                && dp[nrow][ncol] == existcolor && vis[nrow][ncol] == 0){
                    dp[nrow][ncol] = color;
                    vis[nrow][ncol] = 1;
                    queue.add(new Pair(nrow, ncol));
                }
            }
        }
        return dp;
    }
}