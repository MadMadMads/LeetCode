package leetcode;

/**
 * @author: Luo
 * @description:7. 整数反转
 * @time: 2020/12/16 17:10
 * Modified By:https://leetcode-cn.com/problems/reverse-integer/
 */
public class t6reverse {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }
}
