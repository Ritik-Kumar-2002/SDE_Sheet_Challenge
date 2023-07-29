class Solution {
    public boolean fun(int ind, int target, int [] nums, int [][] dp){
        if(ind == nums.length){
            // System.out.println("target and sum "+target);
            if(target == 0) return true;
            return false;
        }
        if(target == 0) return true;
        if(dp[ind][target] != -1){
            if(dp[ind][target] == 0) return false;
            return true;
        } 
        boolean f1 = false;
        if(target >= nums[ind]){
            f1 = fun(ind+1, target-nums[ind], nums, dp);
        }
        boolean f2 = fun(ind+1, target, nums, dp);
        
        if(f1 || f2) dp[ind][target] = 1;
        else dp[ind][target] = 0;
        return f1 || f2;
    }
    public boolean canPartition(int[] nums) {
      
        int n = nums.length,target=0;
        for(int i=0; i<n; i++) target += nums[i];
        if(target %2 != 0) return false;
        target =target/2;
    
        int [][]dp =new int[n][target+1];
        
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) dp[i][j] = -1;
        }

        boolean ans = fun(0, target, nums, dp);

        return ans;
    }
}