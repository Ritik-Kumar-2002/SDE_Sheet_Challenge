class Solution {
    public boolean isSave(int row, int col, char [][] mat){
        int i=row, j= col;
        int n = mat.length;
        // top left diagonal check 
        while(i>=0 && j>=0){
            if(mat[i][j] == 'Q') return false;
            i--;
            j--;
        }

        // row check 
        i= row;
        j = col;
        while(i>=0){
            if(mat[i][j] == 'Q') return false;
            i--;
        }

        // upward column check 
        i=row;
        j = col;
        while(j>=0){
            if(mat[i][j] == 'Q') return false;
            j--;
        }

        // check top right digaonal
        i=row;
        j = col;
        while(i>=0 && j< n){
            if(mat[i][j] == 'Q') return false;
            i--;
            j++;
        }

        // check bottom left diagonal 
        i=row;
        j =col;
        while(i<n && j>=0){
            if(mat[i][j] == 'Q') return false;
            i++;
            j--;
        }
        return true;
    }
    public void fun(int row, char [][] mat, List<List<String>> list ){
        int n = mat.length;
        if(row == n) {
            List<String> temp= new ArrayList<>();
            for(int i=0; i<n; i++){
                String st = "";
                for(int j=0; j<n;j++){
                    st += mat[i][j];
                }
                temp.add(st);
            }
            list.add(temp);
            return ;
        }
        for(int col=0; col<n; col++){
            if(isSave(row , col, mat)){
                mat[row][col] = 'Q';
                fun(row+1,mat, list);
                mat[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        char  [][] mat = new char[n][n];
        List<List<String>> list= new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = '.';
            }
        } 
        fun(0, mat, list);
        return list;
    }
}