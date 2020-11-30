package leetcode;

import java.util.HashMap;

/**
 * @author: Luo
 * @description:12. 整数转罗马数字
 * @time: 2020/4/28 16:26
 * Modified By:https://leetcode-cn.com/problems/integer-to-roman/
 */
public class intToRoman {
    public String intToRoman(int num) {
    StringBuilder res = new StringBuilder();
    int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    int i = 0;
    while (num > 0) {
        while (num >= nums[i]) {
            res.append(romans[i]);
            num -= nums[i];
        }
        i++;
    }
    return res.toString();
 }
}
