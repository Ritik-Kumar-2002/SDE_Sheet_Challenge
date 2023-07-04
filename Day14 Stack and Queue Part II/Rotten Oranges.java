class Pair{
    int row;
    int col;
    int time;
    public Pair(int row, int col,int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue =new LinkedList<>();
        int n = grid.length, m = grid[0].length;
        int [][] visited =new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j] == 2){
                    queue.add(new Pair(i, j, 0));
                    visited[i][j] = 1;
                }
            }
        }
        int [] delrow = {-1, 0, +1, 0};
        int [] delcol = {0, +1, 0, -1};
        int max=0;
        while(!queue.isEmpty()){
            Pair p = queue.remove();
            max = Math.max(max, p.time);
            for(int i=0; i<4; i++){
                int nrow = p.row+delrow[i];
                int ncol = p.col+delcol[i];
                if(nrow >=0 && nrow < n && ncol>=0 && ncol <m && grid[nrow][ncol] == 1 && visited[nrow][ncol]==0){
                    visited[nrow][ncol] = 1;
                    queue.add(new Pair(nrow, ncol, p.time+1)); 
                    grid[nrow][ncol] = 2;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return max;
    }
}