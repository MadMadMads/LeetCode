package leetcode;

/**
 * @author: Luo
 * @description:70. 爬楼梯
 * @time: 2020/9/20 16:25
 * Modified By:https://leetcode-cn.com/problems/climbing-stairs/
 */
public class climbStairs {
    public int climbStairs(int n) {
        int first = 1;
        int second = 2;
        int res = 1;
        if (n ==2) return 2;
        for (int i = 3; i <= n; i++) {
            res = first + second;
            first = second;
            second = res;
        }
        return res;
    }
}
