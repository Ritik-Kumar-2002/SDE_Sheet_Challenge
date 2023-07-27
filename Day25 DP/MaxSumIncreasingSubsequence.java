class Solution
{
    
    public int IncresSuq(int ind,  int prev, int [] arr, int [][] dp){
        if(ind == arr.length) return 0;
        
        if(dp[ind][prev+1] != -1) return dp[ind][prev+1];
        int pick=0,notpick=0;
        if(prev == -1 || arr[ind] > arr[prev]){
            pick = arr[ind] + IncresSuq(ind+1, ind, arr, dp);
        }
            notpick = 0 + IncresSuq(ind+1, prev, arr, dp);
            
        return dp[ind][prev+1] = Math.max(pick, notpick);
    }
	public int maxSumIS(int arr[], int n)  
	{  
	   int [][] dp = new int[n+1][n+2];
	   for(int i=0; i<dp.length; i++){
	       for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
	   }
	   return IncresSuq(0, -1, arr, dp);
	}  
}