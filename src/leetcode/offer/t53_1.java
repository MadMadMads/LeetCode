package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 53 - I. 在排序数组中查找数字 I
 * @time: 2020/11/24 12:01
 * Modified By:https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof/
 */
public class t53_1 {
    public static int search(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        int res = 0;
        while (left <= right && res == 0) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                res++;
                int i = mid - 1,j = mid + 1;
                while (i >= 0 && nums[i] == target) {
                    if (nums[i] == target) {
                        res ++; i--;
                    }
                }
                while (j <nums.length && nums[j] == target) {
                    if (nums[j] == target) {
                        res ++; j++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{5},5));
    }
}
