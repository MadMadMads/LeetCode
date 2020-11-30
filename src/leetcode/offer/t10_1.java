package leetcode.offer;

/**
 * @author: Luo
 * @description:
 * @time: 2020/7/2 13:47
 * Modified By:
 */
public class t10_1 {
    public int fib(int n) {
        int a = 1,b = 1;
        if (n == 0) return 0;
        for (int i = 2; i < n; i++) {
            int temp = b;
            b = ( temp + a ) % 1000000007;
            a = temp;
        }
        return b;
    }
}
