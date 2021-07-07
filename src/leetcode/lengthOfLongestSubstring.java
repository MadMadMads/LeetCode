package leetcode;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: Luo
 * @description:3. 无重复字符的最长子串
 * @time: 2020/8/12 21:46
 * Modified By:https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * 遇到重复的，挨个把最左边的全部移除再添加，形成新的子串，最长的子串已经记录
 */
public class lengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> res = new HashSet<>();
        boolean flag = true;
        char[] chars = s.toCharArray();
        int i = 0, j = 0, ans = 0;
        while (i < chars.length && j < chars.length) {
            if (!res.contains(chars[j])) {
                res.add(chars[j]);
                j++;
                ans = Math.max(res.size(), ans);
            } else {
                res.remove(chars[i]);
                i++;
            }
        }
        return ans;
    }

    public static int lengthOfLongestSubstring1(String s) {
        HashMap<Character, Integer> res = new HashMap();
        char[] chars = s.toCharArray();
        int max = Integer.MIN_VALUE;
        int left = 0, right = 0;
        while (right < chars.length) {
            char c = chars[right];
            res.put(c, res.getOrDefault(c, 0) + 1);
            right++;
            while (res.get(c) > 1) {
                char c1 = chars[left];
                res.put(c1, res.get(c) - 1);
                if (res.get(c1) == 0) res.remove(c1);
                left++;
            }
            if (right - left > max) max = right - left;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring1("pwwkew"));
    }
}
