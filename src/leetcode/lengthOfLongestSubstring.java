package leetcode;


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
                ans = Math.max(res.size(),ans);}
            else {
                res.remove(chars[i]);
                i ++;
            }
        }
        return ans;
    }

    public static int lengthOfLongestSubstring1(String s) {
        Set<Character> res = new HashSet<>();
        char[] chars = s.toCharArray();
        int length = 0;
        int i = 0,j = 0;
        while (i < chars.length && j < chars.length) {
            if (res.contains(chars[j])) {
                res.remove(chars[i]);
                i++;
            } else {
                res.add(chars[j]);
                j++;
                length = length > res.size() ? length : res.size();
            }
        }
        return length;
    }

        public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring1("pwwkew"));
    }
}
