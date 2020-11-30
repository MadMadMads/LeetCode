package leetcode.offer;

import java.util.ArrayList;
import java.util.Vector;

/**
 * @author: Luo
 * @description:
 * @time: 2020/11/17 12:54
 * Modified By:
 */
public class t60 {
    public double[] dicesProbability(int n) {
        int[][] count = new int[n+1][6*n + 1];
        for (int i = 1; i <= 6; i++) {
            count[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = i; j <= i * 6; j++) {
                for (int cur = 1; cur <=6; cur++) {
                    if (j - cur < 0) continue;
                    count[i][j] += count[i - 1][j - cur];
                } } }
        double[] ans = new double[6 * n - n + 1];
        for(int i = n; i <= 6 * n; i++)
            ans[i - n] = ((double)count[n][i]) / (Math.pow(6,n));
        return ans;
    }
}
