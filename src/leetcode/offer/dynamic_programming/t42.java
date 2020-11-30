package leetcode.offer.dynamic_programming;

/**
 * @author: Luo
 * @description:连续子数组的最大和
 * @time: 2020/6/13 15:41
 * Modified By:https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 */
public class t42 {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int[] list = new int[nums.length];
        list[0] = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            list[i] = Math.max(nums[i],nums[i] + list[i - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res,list[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        t42 t42 = new t42();
        System.out.println(t42.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
