package leetcode.offer.dynamic_programming;

/**
 * @author: Luo
 * @description:面试题14- I. 剪绳子
 * @time: 2020/6/15 11:01
 * Modified By:https://leetcode-cn.com/problems/jian-sheng-zi-lcof/
 */
public class t14_1 {
    public static int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1; dp[2] = 2; dp[3] = 3;
        for (int i = 4; i <= n; i++) {
            int res = 0;
            for (int j = 1; j <i ; j++) {
                res = Math.max(res,dp[j] * (i - j));
            }
            dp[i] = res;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
}
