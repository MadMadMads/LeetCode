package leetcode;


import com.sun.tools.javac.util.StringUtils;

/**
 * @author: Luo
 * @description:415. 字符串相加
 * @time: 2021/1/3 15:40
 * Modified By:https://leetcode-cn.com/problems/add-strings/
 */
public class T415addStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder res = new StringBuilder();
        int temp = 0,i = num1.length() - 1,j = num2.length()-1;
        while (i >= 0 || j >= 0) {
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            temp = n1 + n2 + temp;
            res.append(temp % 10);
            temp /= 10;
            i--;j--;
        }
        if (temp > 0) {
            res.append(temp);
        }
        return res.reverse().toString();
    }

    }
