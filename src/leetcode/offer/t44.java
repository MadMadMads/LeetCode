package leetcode.offer;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/18 20:14
 * Modified By:
 */
public class t44 {
    public int findNthDigit(int n) {
        int digit = 1,start = 1,count = 9;
        while (n > count) {
            n -= count;
            digit += 1;
            start *= 10;
            count = 9 * digit * start;
        }
        long num = start + (n - 1) / digit;
        int dig = (n - 1) % digit;
        return Long.toString(num).charAt(dig);
    }
}
