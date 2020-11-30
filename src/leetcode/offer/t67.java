package leetcode.offer;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/17 13:53
 * Modified By:
 */
public class t67 {
    public int strToInt(String str) {
        str = str.trim();
        char[] chars = str.toCharArray();
        if (chars.length == 0) return 0;
        boolean flag = false;
        int res = 0;
        if (chars[0] == '-') flag = true;
        else if (chars[0] == '+') flag = false;
        else if (chars[0] >= '0' && chars[0] <= '9') res = res + chars[0] - '0';
        else return 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] >= '0' && chars[i] <= '9') {
                if (res > (Integer.MAX_VALUE - chars[i] + '0') / 10 ) {
                    return flag? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                res = res * 10 + chars[i] - '0';
            } else {
                break;
            }
        }
        return flag ? -res : res;
    }

    public static void main(String[] args) {
        t67 t67 = new t67();
        System.out.println(t67.strToInt(" "));
    }
}
