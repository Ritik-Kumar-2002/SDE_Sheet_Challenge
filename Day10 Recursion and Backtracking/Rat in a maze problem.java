class Solution {
    public static void fun(int row, int col, int [][] mat, String dir, ArrayList<String> list){
        int n = mat.length;
        int m = mat[0].length;
        if(row == n-1 && col == m-1){
            list.add(dir);
            return ;
        }
       
        if(row-1 <n && row-1>=0 && col >=0 && col < m && mat[row-1][col] == 1){
            mat[row][col] = 0;
            fun(row-1, col, mat, dir+"U", list);
            mat[row][col] = 1;
        }
        if(row <n && row >=0 && col+1 >=0 && col+1 < m && mat[row][col+1] == 1){
            mat[row][col] = 0;
            fun(row, col+1, mat, dir+"R", list);
            mat[row][col] = 1;
        }
        if(row+1 <n && row+1>=0 && col >=0 && col < m && mat[row+1][col] == 1){
            mat[row][col] = 0;
            fun(row+1, col, mat, dir+"D", list);
            mat[row][col] = 1;
        }
        if(row <n && row>=0 && col-1 >=0 && col-1 < m && mat[row][col-1] == 1){
            mat[row][col] = 0;
            fun(row, col-1, mat, dir+"L", list);
            mat[row][col] = 1;
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        ArrayList<String> list= new ArrayList<>();       
        if(m[0][0] == 0) return list;
        fun(0, 0, m, "", list);
        return list;
    }
}