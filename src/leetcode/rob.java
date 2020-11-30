package leetcode;

/**
 * @author: Luo
 * @description:198. 打家劫舍
 * @time: 2020/9/21 16:49
 * Modified By:https://leetcode-cn.com/problems/house-robber/
 */
public class rob {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int N = nums.length;
        int[] dp = new int[N+1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i < N + 1; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i -1],dp[i -1]);
        }
        return dp[N];
    }
}
