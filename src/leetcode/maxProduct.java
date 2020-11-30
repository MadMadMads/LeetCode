package leetcode;

/**
 * @author: Luo
 * @description:152. 乘积最大子数组
 * @time: 2020/9/21 16:19
 * Modified By:https://leetcode-cn.com/problems/maximum-product-subarray/
 */
public class maxProduct {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int imax = 1,imin =1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax * nums[i],nums[i]);
            imin = Math.min(imin * nums[i],nums[i]);
            max = Math.max(max, imax);
        }
        return max;
    }

    public static void main(String[] args) {
        maxProduct maxProduct= new maxProduct();
        System.out.println(maxProduct.maxProduct(new int[]{-2,2,3,-1}));
    }
}
