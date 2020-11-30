package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 49. 丑数
 * @time: 2020/11/18 16:47
 * Modified By:https://leetcode-cn.com/problems/chou-shu-lcof/
 */
public class t49 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        int a = 0,b = 0, c = 0;
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(Math.min(dp[a] * 2,dp[b] * 3), dp[c] * 5);
            if (dp[i] == dp[a] * 2)
                a++;
            if (dp[i] == dp[b] * 3)
                b++;
            if (dp[i] == dp[c] * 5)
                c++;
        }
        return dp[n-1];
    }
}
