package leetcode.competition.A2018;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/13 17:00
 * Modified By:
 */
public class t4 {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 7, count = 4;
        long num = 9;
        long l = 59084709587505L;
        for (int i = 0; i <= 30;i++) {
            for (int j = 0; j<= 30; j++) {
                for (int k =0; k<= 30; k++) {
                    if (Math.pow(3,i)* Math.pow(5,j)*Math.pow(7,k) <= l) {
                        num+=1;
                    }
                }
            }
        }
    }
}