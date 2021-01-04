package leetcode;

/**
 * @author: Luo
 * @description:209. 长度最小的子数组
 * @time: 2021/1/4 23:08
 * Modified By:https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 */
public class T209minSubArrayLen {
    public int minSubArrayLen(int s, int[] nums) {
        int res = Integer.MAX_VALUE,left = 0,right = 0,sum = 0;
        while (right < nums.length) {
            sum += nums[right];
            right++;
            while (sum >= s) {
                res = Math.min(res,right - left);
                sum -= nums[left];
                left++;
            }
        }
        return res == Integer.MIN_VALUE ? -1 : res;
    }
}
