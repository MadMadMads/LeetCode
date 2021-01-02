package leetcode;

/**
 * @author: Luo
 * @description:121. 买卖股票的最佳时机
 * @time: 2021/1/2 20:21
 * Modified By:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 */
public class T121maxProfit {
    public int maxProfit(int[] prices) {
        int dp_i_0 = 0,dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0;i <prices.length; i++) {
            dp_i_0 = Math.max(dp_i_0,dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1,-prices[i]);
        }
        return dp_i_0;
    }
}
