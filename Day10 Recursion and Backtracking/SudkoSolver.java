class Solution {
    public boolean canISolve(char [][] board, int row, int col, int num){
        for(int i=0; i<9; i++){
            if(board[i][col] == (char)(num+'0')) return false;
            if(board[row][i] == (char)(num+'0')) return false;
        }
        
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i= sr; i< sr+3; i++){
            for(int j=sc; j< sc+3; j++){
                if(board[i][j] == (char)(num + '0')) return false;
            }
        }
        return true;
    }
    public boolean solve(char [][] board, int row, int col ){
        int n = board.length;
        if(row == n) return true;
        int nrow =0, ncol= 0;
        if(col != board.length-1){
            ncol = col + 1;
            nrow = row;
        }else {
            nrow = row + 1;
            ncol = 0;
        }
        if(board[row][col] != '.'){
            if(solve(board, nrow, ncol)) return true;
        } else {
            for(int num=1; num<=9; num++){
                if(canISolve(board, row, col, num)){
                    board[row][col] = (char)(num+'0');
                    if(solve(board, nrow, ncol )) return true;
                    board[row][col] = '.';
                }
            }
        }
        
        return false;
    }
    public void solveSudoku(char[][] board) {
        int n = board.length;
        solve(board, 0, 0);
    }
}