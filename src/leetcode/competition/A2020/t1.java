package leetcode.competition.A2020;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/15 10:04
 * Modified By:
 */
public class t1 {
    public static void main(String[] args) {
        int i = 700;
        int min = 1;
        while (true) {
            if (min % 2 == 1) {
                if (i < 600) break;
                i = i - 600;
            } else {
                i +=300;
            }
            min++;
        }
        System.out.println(i);
        System.out.println(min*60  + i/10);
    }
}
