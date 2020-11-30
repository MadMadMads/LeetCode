package leetcode.competition.A2019;

import java.math.BigInteger;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/10 20:14
 * Modified By:
 */
public class t5 {
    public static void main(String[] args) {
        long d = 212353;
        BigInteger n = new BigInteger(String.valueOf("1001733993063167171"));
        long n1 = Long.MAX_VALUE;
        for (long i = 1000;i < Integer.MAX_VALUE;i++) {
            long res = (long) Math.pow(i,d) % n1;
            if (res == 20190324) {
                System.out.println(i);
            }
        }
    }

}
