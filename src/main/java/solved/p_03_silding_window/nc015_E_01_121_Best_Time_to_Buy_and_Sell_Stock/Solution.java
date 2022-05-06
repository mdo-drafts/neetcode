package solved.p_03_silding_window.nc015_E_01_121_Best_Time_to_Buy_and_Sell_Stock;

public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return maxProfit;
    }
}
