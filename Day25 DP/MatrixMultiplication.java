class Solution{
    public static int fun(int i, int j, int [] arr, int [][] dp){
        if(i==j) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];
        int min =Integer.MAX_VALUE;
        for(int k=i; k<j; k++){
            int steps = arr[i-1]*arr[k]*arr[j] + fun(i, k, arr, dp) + fun(k+1, j, arr, dp);
            if(steps< min) min = steps;
        }
        return dp[i][j] = min;
        
    }
    static int matrixMultiplication(int N, int arr[])
    {
        int [][] dp =new int[N][N];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        }
        return fun(1,N-1, arr, dp);
    }
}