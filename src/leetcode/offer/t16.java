package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 16. 数值的整数次方
 * @time: 2020/11/13 22:51
 * Modified By:https://leetcode-cn.com/problems/shu-zhi-de-zheng-shu-ci-fang-lcof/
 */
public class t16 {
    public double myPow(double x, int n) {
        if(x == 0) return 0;
        long b = n;
        double res = 1.0;
        if(b < 0) {
            x = 1 / x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) res *= x;
            x *= x;
            b >>= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        t16 t16 = new t16();
        System.out.println(t16.myPow(2,3));
    }
}
