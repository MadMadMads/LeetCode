package leetcode;

/**
 * @author: Luo
 * @description:26. 删除排序数组中的重复项
 * @time: 2020/12/15 22:38
 * Modified By:https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        int index = 1, nowNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nowNum) {
                continue;
            } else {
               nowNum = nums[i];
               nums[index] = nums[i];
               index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0}));
    }
}
