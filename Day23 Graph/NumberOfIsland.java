class Solution {

    public void DFS(int row, int col, char [][] grid, int [][] visited){
        int N= grid.length;
        int M= grid[0].length;
        visited[row][col] = 1;
        int [] delRow = {-1, 0 , 1, 0};
        int [] delCol = {0, 1, 0, -1 };
        for(int i=0; i< 4; i++){
            int NRow = row + delRow[i];
            int NCol = col + delCol[i];
            if(NRow >= 0 && NRow < N && NCol >= 0 && NCol < M && grid[NRow][NCol] == '1' && visited[NRow][NCol] == 0){
                DFS(NRow, NCol, grid, visited);
            }
        }
    }
    public int numIslands(char[][] grid) {
        
        int N = grid.length;
        int M = grid[0].length;
        int count =0;
        int [][] visited = new int [N][M];
        for(int i=0; i< N; i++){
            for(int j=0; j< M; j++){
                if(grid[i][j] == '1' && visited[i][j] == 0){
                    DFS(i, j, grid, visited);
                    count++;
                } 
            }
        }
        return count;
    }
}