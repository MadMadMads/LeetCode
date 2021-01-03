package leetcode;

/**
 * @author: Luo
 * @description:42. 接雨水
 * @time: 2021/1/3 17:17
 * Modified By:https://leetcode-cn.com/problems/trapping-rain-water/
 */
public class T42trap {
    public int trap(int[] height) {
        if (height.length == 0) return 0;
        int left = 0,right = height.length - 1;
        int lmax = height[0],rmax = height[right];
        int res = 0;
        while (left <= right) {
            lmax = Math.max(lmax,height[left]);
            rmax = Math.max(rmax,height[right]);
            if (lmax <= rmax) {
                res += lmax - height[left];
                left++;
            } else {
                res += rmax - height[right];
                right--;
            }
        }
        return res;
    }
}
