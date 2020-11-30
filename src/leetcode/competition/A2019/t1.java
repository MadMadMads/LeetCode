package leetcode.competition.A2019;

import java.math.BigInteger;
import java.util.concurrent.ForkJoinPool;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/10 18:51
 * Modified By:
 */
public class t1 {
    public static boolean t1(int num) {
        while (num !=0) {
            int n = num % 10;
            num = num / 10;
            if (n == 2 || n == 1 || n == 0|| n == 9) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("0");
        for (int i = 0; i <= 2019; i++) {
            if (t1.t1(i)) {
                BigInteger bigInteger1 = new BigInteger(String.valueOf(i));
                bigInteger = bigInteger.add(bigInteger1.multiply(bigInteger1));
            }
        }
        System.out.println(bigInteger);
    }
}
