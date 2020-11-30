package leetcode.offer;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/3 21:02
 * Modified By:
 */
public class translateNum {
    Set<StringBuilder> set;
    int count = 0;
    public void dfs(int j, char[] chars, StringBuilder stringBuilder) {
        if (j == chars.length) {
            if (!set.contains(stringBuilder)) {
                count++;
                set.add(stringBuilder);
            }
            return ;
        }

    }
    public int translateNum(int num) {
        int res = 0;
        String s = String.valueOf(num);
        char[] chars = s.toCharArray();
        set = new HashSet<>();
        return 0;
    }
}
