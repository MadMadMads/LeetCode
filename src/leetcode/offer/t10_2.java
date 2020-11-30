package leetcode.offer;

/**
 * @author: Luo
 * @description:面试题10- II. 青蛙跳台阶问题
 * @time: 2020/6/17 19:00
 * Modified By:https://leetcode-cn.com/problems/qing-wa-tiao-tai-jie-wen-ti-lcof/
 */
public class t10_2 {
    public int numWays(int n) {
        int first = 1;
        int res = 1;
        int seconde = 1;
        for (int i = 3; i <= n ; i++) {
            res = seconde + first;
            first = seconde;
            seconde = res;
        }
        return res;
    }
}

