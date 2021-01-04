package leetcode;

/**
 * @author: Luo
 * @description:70. 爬楼梯
 * @time: 2020/9/20 16:25
 * Modified By:https://leetcode-cn.com/problems/climbing-stairs/
 */
public class climbStairs {
    public int climbStairs(int n) {
        int[] temp = new int[]{1,2};
        if  (n >0 &&n <= 2) return temp[n - 1];
        for (int i = 3; i <= n; i++) {
            int j = temp[1];
            temp[1] = temp[0] + temp[1];
            temp[0] = j;
        }
        return temp[1];
    }
}
