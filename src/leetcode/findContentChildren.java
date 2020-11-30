package leetcode;

import java.util.Arrays;

/**
 * @author: Luo
 * @description:455. 分发饼干
 * @time: 2020/10/9 16:25
 * Modified By:https://leetcode-cn.com/problems/assign-cookies/
 */
public class findContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int index = 0;
        for (int i = 0; i < g.length; i++) {
            for (int j = index;j < s.length;j++) {
                if (g[i] <= s[j]) {
                    index = j + 1;
                    res++;
                    break;
                }
            } }
        return res;
    }
}
