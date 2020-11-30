package leetcode.competition.A2018;

import java.util.Scanner;

/**
 * @author: Luo
 * @description:
 * @time: 2020/10/13 19:36
 * Modified By:
 */
public class t6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, m;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        m = input.nextInt();
        int[][][] martix = new int[a + 1][b + 1][c + 1];

        for (int i = 1; i <= a; ++i)
            for (int j = 1; j <= b; ++j)
                for (int k = 1; k <= c; ++k)
                    martix[i][j][k] = input.nextInt();

        int lat, rat, lbt, rbt, lct, rct, ht;
        int flag = 0;
        for (int p = 1; p <= m; ++p) {
            lat = input.nextInt();
            rat = input.nextInt();
            lbt = input.nextInt();
            rbt = input.nextInt();
            lct = input.nextInt();
            rct = input.nextInt();
            ht = input.nextInt();
            for (int i = lat; i <= rat; ++i)
                for (int j = lbt; j <= rbt; ++j)
                    for (int k = lct; k <= rct; ++k) {
                        martix[i][j][k] -= ht;
                        if (martix[i][j][k] < 0) {
                            flag = p;
                            break;
                        }
                    }

            if (flag != 0)
                break;
        }
        System.out.println(flag);
    }
}
