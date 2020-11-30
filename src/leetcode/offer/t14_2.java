package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 14- II. 剪绳子 II
 * @time: 2020/11/20 17:11
 * Modified By:https://leetcode-cn.com/problems/jian-sheng-zi-ii-lcof/
 */
public class t14_2 {
    public static int cuttingRope(int n) {
        long[] dp = new long[n + 1];
        dp[0] = 0;dp[1] = 1;dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = (Math.max(dp[i], Math.max((dp[i - j] * j)% 1000000007,((i - j) * j))% 1000000007 )) ;
            }
        }
        return (int)dp[n];
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(120));
    }
}
