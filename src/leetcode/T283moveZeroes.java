package leetcode;

/**
 * @author: Luo
 * @description:283. 移动零
 * @time: 2020/12/30 21:19
 * Modified By:https://leetcode-cn.com/problems/move-zeroes/
 */
public class T283moveZeroes {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }
}
