package leetcode;

import java.util.Arrays;

/**
 * @author: Luo
 * @description:322. 零钱兑换
 * @time: 2020/9/22 16:27
 * Modified By:https://leetcode-cn.com/problems/coin-change/
 */
/*  递归求解
public class coinChange {
    int res = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        if(coins.length == 0) {
            return -1;
        }

        findWay(coins,amount,0);

        // 如果没有任何一种硬币组合能组成总金额，返回 -1。
        if(res == Integer.MAX_VALUE) {
            return -1;
        }
        return res;
    }

    public void findWay(int[] coins,int amount,int count){
        if(amount < 0){
            return;
        }
        if(amount == 0){
            res = Math.min(res,count);
        }

        for(int i = 0;i < coins.length;i++) {
            findWay(coins,amount-coins[i],count+1);
        }
    }
}
*/



public class coinChange {
    public int coinChange(int[] coins, int amount) {
        if (amount <=0) return 0;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i = 1; i < dp.length; i++) {
            for (int coin : coins) {
                if (i - coin < 0) continue;
                dp[i] = Math.min(dp[i],dp[i-coin] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}

