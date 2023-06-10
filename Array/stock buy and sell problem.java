class Solution {
    public int maxProfit(int[] prices) {
        int prev_profit=prices[0], max_profit=Integer.MIN_VALUE;
        int n = prices.length;
        for(int i=0; i < n; i++){
            max_profit = Math.max(prices[i]- prev_profit, max_profit);
            prev_profit = Math.min(prev_profit, prices[i]);
        }
        return max_profit;
    }
}