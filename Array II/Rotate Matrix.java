class Solution {
    public void rotate(int[][] matrix) {
        int i=0, j=0;
        int n = matrix.length;
        while(i<n && j<n){
            for(int k=j; k<n; k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[k][i]; 
                matrix[k][i] = temp;
            }
            i++;
            j++;
        }
        for( i=0; i<n; i++){
            int leftCol=0, rightCol=n-1;
            while(leftCol<rightCol){
                int temp = matrix[i][leftCol];
                matrix[i][leftCol] = matrix[i][rightCol]; 
                matrix[i][rightCol] = temp;
                leftCol++;
                rightCol--;
            }
        }
    }
}