package leetcode;

/**
 * @author: Luo
 * @description:309. 最佳买卖股票时机含冷冻期
 * @time: 2021/1/2 20:39
 * Modified By:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 */
public class T309maxProfit {
    public static int maxProfit(int[] prices) {
        int dp_i_0 = 0,dp_i_1 = Integer.MIN_VALUE,dp_i_pre_0 = 0;
        for (int i = 0; i < prices.length; i++) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0,dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1,dp_i_pre_0 - prices[i]);
            dp_i_pre_0 = temp;
        }
        return dp_i_0;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,3,0,2}));
    }
}
