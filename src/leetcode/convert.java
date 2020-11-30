package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Luo
 * @description:6. Z 字形变换
 * @time: 2020/8/14 10:33
 * Modified By:https://leetcode-cn.com/problems/zigzag-conversion/
 */
public class convert {
    public static String convert(String s, int numRows) {
        List<StringBuilder> res = new ArrayList<>();
        if (numRows ==1) {return s;}
        for (int i = 0; i < numRows; i++) {
            res.add(new StringBuilder());
        }
        int dir = -1,seat = 0;
        for (char c : s.toCharArray()) {
            res.get(seat).append(c);
            if (seat <numRows - 1 && seat > 0) {
            seat += dir;
            } else {
                dir = -dir;
                seat += dir;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            stringBuilder.append(res.get(i));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("LEETCODE",3));
    }
}
