package BestTimetoBuyAndSellStock;


public class Solution {
    public int maxProfit(int[] prices) {
        int lPrice = Integer.MAX_VALUE;
        int mProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            lPrice = Math.min(lPrice,prices[i]);
            mProfit = Math.max(prices[i]-lPrice, mProfit);
        }

        return mProfit;
    }
}
