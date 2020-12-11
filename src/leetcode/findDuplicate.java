package leetcode;

/**
 * @author: Luo
 * @description:287. 寻找重复数
 * @time: 2020/12/11 16:39
 * Modified By:https://leetcode-cn.com/problems/find-the-duplicate-number/
 */
public class findDuplicate {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 != i) {
                return i+1;
            }
        }
        return n + 1;
    }
}
