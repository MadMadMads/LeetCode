package leetcode.offer;

/**
 * @author: Luo
 * @description:剑指 Offer 58 - II. 左旋转字符串
 * @time: 2020/6/24 15:20
 * Modified By:https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */
public class t58_2 {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        res.append(s.substring(n,s.length()));
        res.append(s.substring(0,n));
        return res.toString();
    }
}
