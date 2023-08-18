class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;  // set to the highest integer initially
        int maxProfit = 0;  // set to zero initially
        
        for (int price : prices) {
            // Update minPrice if the current price is lower
            minPrice = Math.min(minPrice, price);
            // Calculate profit for selling at current price & buying at minPrice
            int potentialProfit = price - minPrice;
            // Update maxProfit if potentialProfit is greater
            maxProfit = Math.max(maxProfit, potentialProfit);
        }
        
        return maxProfit;
    }
}
