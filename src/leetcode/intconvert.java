package leetcode;

/**
 * @author: Luo
 * @description:
 * @time: 2020/4/17 20:17
 * Modified By:
 */
public class intconvert {
    public static long func1(int x,long y) {
        if(x<10) {
            long z = y*10 + x;
            return z;
        }
        else {
            y = y*10 + x%10;
            return func1(x/10,y);
        }
    }
    public static int reverse(int x) {
        if (x > 214748364 || x < -214748364) {
        return 0;
    }
        return x>0?(int)func1(x,0):(int)-func1(-x,0);
    }

    public static void main(String[] args) {
        System.out.println( reverse(1534236469));
    }
}
