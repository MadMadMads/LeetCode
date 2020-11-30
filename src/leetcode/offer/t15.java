package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 15. 二进制中1的个数
 * @time: 2020/6/3 12:59
 * Modified By:https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 */
public class t15 {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n /= 2;
        }
        return res;
    }


    public static void main(String[] args) {
        int n = 42967293;
        t15 t15 = new t15();
        System.out.println(t15.hammingWeight(n));
    }
}
