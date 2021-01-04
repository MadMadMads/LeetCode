package leetcode;

/**
 * @author: Luo
 * @description:33. 搜索旋转排序数组
 * @time: 2020/12/16 21:30
 * Modified By:https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 */
public class T33search {
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[left]) {
                if (target < nums[mid] && target >= nums[left]) right = mid - 1;
                else {
                    left = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
