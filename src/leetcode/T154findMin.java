package leetcode;

/**
 * @author: Luo
 * @description:154. 寻找旋转排序数组中的最小值 II
 * @time: 2020/12/18 22:11
 * Modified By:https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
 */
public class T154findMin {
    public static int findMin(int[] nums) {
        int left = 0,right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = right - 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{1,1}));
    }
}
