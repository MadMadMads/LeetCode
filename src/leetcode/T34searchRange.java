package leetcode;

/**
 * @author: Luo
 * @description:34. 在排序数组中查找元素的第一个和最后一个位置
 * @time: 2020/12/16 17:40
 * Modified By:https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class T34searchRange {
    public int getLeft(int[] nums,int target) {
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
        if (left >= nums.length || nums[left] != target) return -1;
        return left;
    }
    public int getRight(int[] nums,int target) {
        int left = 0,right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (right < 0 || nums[right] != target) return -1;
        return right;
    }
    public int[] searchRange(int[] nums, int target) {
        int left = getLeft(nums,target);
        int right = getRight(nums,target);
        return new int[]{left,right};
    }
}
