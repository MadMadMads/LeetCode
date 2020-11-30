package leetcode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/9/18 17:15
 * Modified By:
 */
public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            if (sum <0) sum = 0;
            sum = sum + i;
            res = Math.max(res,sum);
        }
        return res;
    }
}
