package leetcode;

/**
 * @author: Luo
 * @description:剑指 Offer 17. 打印从1到最大的n位数
 * @time: 2020/11/24 10:44
 * Modified By:https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 */
public class t17 {
    public int[] printNumbers(int n) {
        if (n == 0) return new int[0];
        int count = (int)Math.pow(10,n);
        int[] res = new int[count - 1];
        for (int i = 1; i < count; i++) {
            res[i - 1] = i;
        }
        return res;
    }
}
