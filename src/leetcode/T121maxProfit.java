package leetcode;

/**
 * @author: Luo
 * @description:122. 买卖股票的最佳时机 1
 * @time: 2021/1/2 20:28
 * Modified By:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class T121maxProfit {
    /** DP **/
    public int maxProfit(int[] prices) {
        int dp_0 = 0,dp_1 = Integer.MIN_VALUE;
        for (int n : prices) {
            dp_0 = Math.max(dp_0,dp_1 + n);
            dp_1 = Math.max(dp_1,-n);
        }
        return dp_0;
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
