package leetcode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/12/18 21:39
 * Modified By:
 */
public class T153findMin {
    public static int findMin(int[] nums) {
        if (nums.length == 0) return -1;
        if (nums.length == 1) return nums[0];
        int left = 0,right = nums.length -1;
        if (nums[right] > nums[0]) {
            return nums[0];
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid + 1 < nums.length && nums[mid + 1] < nums[mid]) return nums[mid + 1];
            if (mid - 1 > 0 && nums[mid - 1] > nums[mid]) return nums[mid];
            if (nums[left] <= nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{2,2,2,0,1}));
    }
}
