package leetcode;

import java.util.Arrays;

/**
 * @author: Luo
 * @description:300. 最长上升子序列
 * @time: 2020/9/28 20:58
 * Modified By:https://leetcode-cn.com/problems/longest-increasing-subsequence/
 */
public class lengthOfLIS {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;
       int[] dp = new int[nums.length];
       int res = 1;
        Arrays.fill(dp,1);
       for (int i = 1;i < nums.length; i++) {
           for (int j = 0; j < i; j++) {
               if (nums[i] <= nums[j]) continue;
               dp[i] = Math.max(dp[j] + 1,dp[i]);
           }
           res = Math.max(res,dp[i]);
       }
       return res;
    }

    public static void main(String[] args) {
        lengthOfLIS lengthOfLIS = new lengthOfLIS();
        System.out.println(lengthOfLIS.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
}
