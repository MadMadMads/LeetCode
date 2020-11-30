package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 64. 求1+2+…+n
 * @time: 2020/6/2 14:43
 * Modified By:https://leetcode-cn.com/problems/qiu-12n-lcof/
 */
public class t64 {
    public int sumNums(int n) {
        if (n == 1) return 1;
        else {
            return sumNums(n-1) + n;
        }
    }
}
