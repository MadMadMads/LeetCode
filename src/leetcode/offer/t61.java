package leetcode.offer;

import java.util.Arrays;

/**
 * @author: Luo
 * @description:剑指 Offer 61. 扑克牌中的顺子
 * @time: 2020/12/2 10:40
 * Modified By:https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/
 */
public class t61 {
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                sum++;
                continue; }
            if (nums[i] == nums[i + 1]) return false;
        }
        return nums[4] - nums[sum] < 5;
    }

    public static void main(String[] args) {
        System.out.println(isStraight(new int[]{1,2,12,0,3}));
    }
}
