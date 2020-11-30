package leetcode.offer;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: Luo
 * @description:剑指 Offer 50. 第一个只出现一次的字符
 * @time: 2020/11/25 13:53
 * Modified By:https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 */
public class t50 {
    public char firstUniqChar(String s) {
        if (s.length() == 0) return ' ';
        char[] chars = s.toCharArray();
        Map<Character,Boolean> dic = new LinkedHashMap<>();
        for (char ch : chars) {
            dic.put(ch,!dic.containsKey(ch));
        }
        for (Map.Entry<Character,Boolean> entry : dic.entrySet()) {
            if (entry.getValue() == true) return entry.getKey();
        }
        return ' ';
    }
}
