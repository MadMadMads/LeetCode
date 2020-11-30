package leetcode;

import java.util.ArrayList;

/**
 * @author: Luo
 * @description:392. 判断子序列
 * @time: 2020/9/27 15:12
 * Modified By:https://leetcode-cn.com/problems/is-subsequence/
 */
public class isSubsequence {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char a : s.toCharArray()) {
            while (i < t.length() && t.charAt(i) != a) i++;
            if (i++ >= t.length()) break;
        }
        return i <= t.length();
    }

    public static void main(String[] args) {
        isSubsequence isSubsequence = new isSubsequence();
        System.out.println(isSubsequence.isSubsequence("axc", "adc"));
    }
}
