class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = 0;
        int min = prices[0];
        
        for(int i=0; i<prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
            }
            int profit = prices[i] - min;
            if(max_profit < profit){
                max_profit = profit;
            }
        }
        return max_profit;
    }
}