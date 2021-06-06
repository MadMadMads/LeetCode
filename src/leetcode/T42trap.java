package leetcode;

import sun.print.SunMinMaxPage;

import java.util.Map;

/**
 * @author: Luo
 * @description:42. 接雨水
 * @time: 2021/1/3 17:17
 * Modified By:https://leetcode-cn.com/problems/trapping-rain-water/
 */
public class T42trap {
    /*public int trap(int[] height) {
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
    }*/
    public int trap1(int[] height) {
        int res = 0;
        int left = 0,right = height.length - 1;
        int l_max = height[0],r_max = height[right];
        while (left <= right) {
            l_max = Math.max(height[left],l_max);
            r_max = Math.max(height[right],r_max);
            if (l_max < r_max) {
                res += l_max - height[left];
                left ++;
            } else {
                res += r_max - height[right];
                right--;
            }
        }
        return res;
    }

    public int trap2(int[] height) {
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            int l_max = 0, r_max = 0;
            for (int left = 0; left <= i; left++) {
                l_max = Math.max(height[left], l_max);
            }
            for (int right = height.length - 1; right >= i; right--) {
                r_max = Math.max(height[right], r_max);
            }
            sum += Math.min(l_max, r_max) - height[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        T42trap t42trap = new T42trap();
        System.out.println(t42trap.trap1(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }
}
