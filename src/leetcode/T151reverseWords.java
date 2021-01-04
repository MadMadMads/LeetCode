package leetcode;

/**
 * @author: Luo
 * @description:151. 翻转字符串里的单词
 * @time: 2021/1/4 22:29
 * Modified By:https://leetcode-cn.com/problems/reverse-words-in-a-string/
 */
public class T151reverseWords {
    public String reverseWords(String s) {
        s = s.trim();
        String[] strings = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = strings.length - 1; i >=0;i--) {
            res.append(strings[i]).append(" ");
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }
}
