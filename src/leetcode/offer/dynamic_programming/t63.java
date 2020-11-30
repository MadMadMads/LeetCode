package leetcode.offer.dynamic_programming;

import java.time.OffsetDateTime;

/**
 * @author: Luo
 * @description:股票的最大利润
 * @time: 2020/6/16 12:17
 * Modified By:https://leetcode-cn.com/problems/gu-piao-de-zui-da-li-run-lcof/
 */
public class t63 {
    public int maxProfit(int[] prices) {
       int res = 0;
       for (int i = 0; i < prices.length - 1; i++) {
           for (int j = i +1; j < prices.length && prices[i] < prices[j]; j++) {
               res = Math.max(res,prices[j] - prices[i]);
           }
       }
       return res;
    }
}
