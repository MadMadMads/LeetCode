package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 56 - II. 数组中数字出现的次数 II
 * @time: 2020/11/26 10:50
 * Modified By:https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-ii-lcof/
 */
public class t56_2 {
    public static int singleNumber(int[] nums) {
        int[] bits = new int[32];
        for (int num : nums) {
            int a = 1;
            for (int i = 0; i<32;i++) {
                if ((num & a) > 0)
                bits[i] += 1;
                a <<= 1;
            }
        }
        int res = 0;
        for (int i = 31; i >= 0;i--) {
            res = res<<1;
            res += bits[i] % 3;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{3,4,3,3}));
    }
}
