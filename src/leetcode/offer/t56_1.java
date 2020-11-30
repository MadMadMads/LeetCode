package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 56 - I. 数组中数字出现的次数
 * @time: 2020/11/4 16:31
 * Modified By:https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/
 */
public class t56_1 {
    public int[] singleNumbers(int[] nums) {
        int mask = 1,n = 0;
        for (int num : nums) {
            n = n ^ num;
        }
        while ((n & mask) == 0) {
            mask <<= 1;
        }
        int a = 0,b = 0;
        for (int num : nums) {
            if ((num & mask) != 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a,b};
    }
}
