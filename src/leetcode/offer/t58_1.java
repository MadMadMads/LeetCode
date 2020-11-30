package leetcode.offer;


import java.util.concurrent.CountDownLatch;
import java.util.stream.StreamSupport;

/**
 * @author: Luo
 * @description:Offer 58 - I. 翻转单词顺序
 * @time: 2020/6/22 9:55
 * Modified By:https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 */
public class t58_1 {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String[] strings = s.split(" ");
        for (int i = strings.length -1; i >= 0; i--) {
            if (!strings[i].isEmpty())
            res.append(strings[i]).append(" ");
        }
        if (res.length()>0)
        res.delete(res.length()-1,res.length());
        return res.toString();
    }

    public static void main(String[] args) {
        t58_1 t58_1 = new t58_1();
        System.out.println(t58_1.reverseWords(""));
    }
}
