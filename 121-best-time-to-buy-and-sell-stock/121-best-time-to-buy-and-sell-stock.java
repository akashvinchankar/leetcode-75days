class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int toProf = 0;
        int sellDiff = 0;
        
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minVal) {
                minVal = prices[i];
            }
            
            sellDiff = prices[i] - minVal;
            
            if(sellDiff > toProf) {
                toProf = sellDiff;
            }
        }
        return toProf;
    }
}