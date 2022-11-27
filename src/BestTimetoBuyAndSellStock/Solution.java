package BestTimetoBuyAndSellStock;


public class Solution {
    public int maxProfit(int[] prices) {
        int lPrice = Integer.MAX_VALUE;
        int mProfit = 0;

        for (int price : prices) {
            lPrice = Math.min(lPrice, price);
            mProfit = Math.max(price - lPrice, mProfit);
        }

        return mProfit;
    }
}
