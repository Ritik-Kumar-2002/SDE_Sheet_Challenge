class Solution {
    public int fun(int i, int j , String s1, String s2, int [][] dp){
        if(i< 0) return j+1;
        if(j< 0) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(s1.charAt(i) == s2.charAt(j)){
            return dp[i][j] = 0 + fun(i-1, j-1, s1, s2, dp);
        }else{
            int insert = 1 + fun(i, j-1, s1, s2, dp);
            int delete = 1 + fun(i-1, j, s1, s2, dp);
            int update = 1 + fun(i-1, j-1, s1, s2, dp);
            return dp[i][j] = Math.min(insert, Math.min(delete, update));
        }
    }
    public int minDistance(String word1, String word2) {
        
        int N = word1.length(), M = word2.length();
        int [][] dp = new int[N][M];
        for(int i=0; i< N; i++){
            for(int j=0; j< M; j++) dp[i][j] = -1;
        }
        return fun(word1.length()-1,word2.length()-1, word1, word2, dp);
    }
}