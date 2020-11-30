package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 57. 和为s的两个数字
 * @time: 2020/11/26 10:43
 * Modified By:https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 */
public class t57 {
    public int[] twoSum(int[] nums, int target) {
        int i = 0,j = nums.length - 1;
        while (i <= j) {
            int sum = nums[i] + nums[j];
            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                return new int[]{nums[i],nums[j]};
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {

    }
}
