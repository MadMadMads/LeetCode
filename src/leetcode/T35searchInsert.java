package leetcode;

/**
 * @author: Luo
 * @description:35. 搜索插入位置
 * @time: 2020/12/16 21:27
 * Modified By:https://leetcode-cn.com/problems/search-insert-position/
 */
public class T35searchInsert {
    public int searchInsert(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left >= nums.length) return nums.length;
        return left;
    }
}
