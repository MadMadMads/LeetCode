package leetcode;

/**
 * @author: Luo
 * @description:面试题 17.16. 按摩师
 * @time: 2020/9/29 13:28
 * Modified By:https://leetcode-cn.com/problems/the-masseuse-lcci/
 */
public class massage {
    public int massage(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length ==1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] +nums[i],dp[i - 1]);
        }
        return dp[nums.length -1];
    }
}
