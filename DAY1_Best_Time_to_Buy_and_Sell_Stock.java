class Solution {
    public int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int profit_total = 0;
        int profit_today = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < least){
                least = prices[i];
            }
            profit_today = prices[i] - least;
            if(profit_total < profit_today){
                profit_total = profit_today;
            }
        }
        return profit_total;
    }
}
//Run time: 2 ms
//Memory: 61.25 mb
