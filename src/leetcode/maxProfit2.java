package leetcode;

import jdk.nashorn.internal.runtime.FindProperty;

/**
 * @author: Luo
 * @description:122. 买卖股票的最佳时机 II
 * @time: 2020/10/7 16:16
 * Modified By:https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 */
public class maxProfit2 {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            int temp = prices[i] - prices[i - 1];
            if (temp > 0) {
                res += temp;
            }
        }
        return res;
    }
}
