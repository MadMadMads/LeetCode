package leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Luo
 * @description:剑指 Offer 38. 字符串的排列
 * @time: 2020/11/12 13:49
 * Modified By:https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 */
public class t38 {
    List<String> res;
    public String[] permutation(String s) {
        res = new ArrayList<>();
        char[] chars = s.toCharArray();
        boolean[] flag = new boolean[chars.length];
        recur(chars,"",flag);
        return res.toArray(new String[res.size()]);
    }
    public void recur(char[] chars,String s,boolean[] flag) {
        if (s.length() == chars.length) {
            res.add(s);
            return ;
        }
        for (int i = 0; i < chars.length; i++) {
            if (flag[i] == true) continue;
            flag[i] = true;
            recur(chars,s + chars[i],flag);
            flag[i] = false;
        }
    }

    public static void main(String[] args) {
        t38 t38 = new t38();
        t38.permutation("abc");
    }
}
