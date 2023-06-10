class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rowlist = new ArrayList<>();
        ArrayList<Integer> collist = new ArrayList<>();
        int n= matrix.length;
        int m= matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0) {
                    rowlist.add(i);
                    collist.add(j);
                }
            }
        }
        for(int i=0; i<rowlist.size(); i++){
            int row = rowlist.get(i);
            int col = collist.get(i);
            for(int j=0; j<n; j++) matrix[j][col] = 0;
            for(int j=0; j<m; j++) matrix[row][j] = 0;
        }
    }
}