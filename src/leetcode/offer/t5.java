package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 05. 替换空格
 * @time: 2020/6/27 18:53
 * Modified By:https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 */
public class t5 {
    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            if (chars[i] == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(s.charAt(i));
            }
            i++;
        }
        return stringBuilder.toString();
    }

}
