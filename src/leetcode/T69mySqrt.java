package leetcode;

/**
 * @author: Luo
 * @description:69. x 的平方根
 * @time: 2020/12/17 14:12
 * Modified By:https://leetcode-cn.com/problems/sqrtx/
 */
public class T69mySqrt {
    public static int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1,right = x / 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (Math.pow(mid,2) == x) {
                return mid;
            } else if (Math.pow(mid,2) < x && Math.pow(mid + 1,2) > x) {
                return mid;
            }
            else if (Math.pow(mid,2) > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));
    }
}

