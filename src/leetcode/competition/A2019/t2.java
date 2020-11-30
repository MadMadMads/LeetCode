package leetcode.competition.A2019;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/10 19:20
 * Modified By:
 */
public class t2 {
    public static void main(String[] args) {
        long a = 1,b=1,c=1;
        long sum = 0;
        for (int i = 4; i <=20190324; i++) {
            sum = (a + b + c)% 10000;
            a = b;
            b =c ;
            c = sum;
        }
        System.out.println(sum );
    }
}
