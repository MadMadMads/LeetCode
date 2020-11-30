package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 65. 不用加减乘除做加法
 * @time: 2020/11/26 12:50
 * Modified By:https://leetcode-cn.com/problems/bu-yong-jia-jian-cheng-chu-zuo-jia-fa-lcof/
 */
public class t65 {
    public int add(int a, int b) {
        while (b != 0) {
            int c = (a & b) << 1;
            a = a ^ b;
            b = c;
        }
        return a;
    }
}
