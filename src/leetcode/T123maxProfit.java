package leetcode;

/**
 * @author: Luo
 * @description:123. 买卖股票的最佳时机 III
 * @time: 2021/1/2 21:15
 * Modified By:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-iii/
 */
public class T123maxProfit {
    public static int maxProfit(int[] prices) {
        int[][][] dp = new int[prices.length][3][2];
        for (int i = 0;i < prices.length; i++) {
            for (int k = 1; k < 3 ; k++) {
                if (i == 0) {
                    dp[0][k][0] = 0;
                    dp[0][k][1] = -prices[0];
                    continue;
                }
                //dp[i][0][0] = dp[i - 1][0][0];
                dp[i][k][0] = Math.max(dp[i - 1][k][0],dp[i - 1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i - 1][k][1],dp[i - 1][k - 1][0] - prices[i]);
            }
        }
        return dp[prices.length - 1][2][0];
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,3,4,5}));
    }
}
