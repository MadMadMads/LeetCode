package leetcode;

import java.util.Arrays;

/**
 * @author: Luo
 * @description:16. 最接近的三数之和
 * @time: 2020/5/18 21:37
 * Modified By:https://leetcode-cn.com/problems/3sum-closest/
 */
public class threeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MIN_VALUE;
        for (int i = 0;i<nums.length - 2;i++) {
            int a = i+1,b=nums.length -1;
            while (a < b ) {
                int sum = nums[i] + nums[a] + nums[b];
                if (Math.abs(sum - target) < Math.abs(min - target)) {
                    min = sum;
                }
                if (sum > target) {
                    b--;
                } else if (sum < target) {
                    a++;
                }
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] list  = new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest(list,1));
    }
}
