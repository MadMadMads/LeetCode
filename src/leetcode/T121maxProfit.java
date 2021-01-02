package leetcode;

/**
 * @author: Luo
 * @description:122. 买卖股票的最佳时机 II
 * @time: 2021/1/2 20:28
 * Modified By:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class T121maxProfit {
    /** DP **/
    public int maxProfit(int[] prices) {
        int dp_i_0 = 0,dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < prices.length; i++) {
            dp_i_1 = Math.max(dp_i_1,dp_i_0 - prices[i]);
            dp_i_0 = Math.max(dp_i_0,dp_i_1 + prices[i]);

        }
        return dp_i_0;
    }
    /** 贪心，只要涨幅了就每天都卖 **/
    public int maxProfit1(int[] prices) {
        int res = 0;
        for (int i = 1;i < prices.length; i++) {
            int temp = prices[i] - prices[i - 1];
            if (temp > 0) res += temp;
        }
        return res;
    }
}
