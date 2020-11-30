package leetcode.offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Luo
 * @description:剑指 Offer 03. 数组中重复的数字
 * @time: 2020/6/25 11:13
 * Modified By:https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof/
 */
public class t03 {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return i;
            } else set.add(i);
        }
        return 0;
    }

    public static void main(String[] args) {
            String s = new String("1");
            s.intern();
            String s2 = "1";
            System.out.println(s == s2);

            String s3 = new String("1") + new String("1");
            s3.intern();
            String s4 = "11";
            System.out.println(s3 == s4);

    }
}
