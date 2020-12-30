package leetcode;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

/**
 * @author: Luo
 * @description:213. 打家劫舍 II
 * @time: 2020/12/30 22:15
 * Modified By:https://leetcode-cn.com/problems/house-robber-ii/
 */
public class T213rob {
    public static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return Math.max(fun1(nums,0,nums.length - 2),fun1(nums,1,nums.length-1));
    }
    public static int fun1(int[] nums,int start,int end) {
        int pre = 0, next = 0,temp;
        for (int i = start; i <= end; i++) {
            temp = next;
            next = Math.max(pre +nums[i],next);
            pre = temp;
        }
        return next;
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,3,2}));
    }
}
