package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 53 - II. 0～n-1中缺失的数字
 * @time: 2020/11/23 14:39
 * Modified By:https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 */
public class t53_2 {
    public static int missingNumber(int[] nums) {
        int left = 0,right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else if (nums[mid] != mid) {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {0,1,3}));
    }
}
