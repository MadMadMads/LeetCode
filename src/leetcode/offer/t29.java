package leetcode.offer;

import java.util.ArrayList;

/**
 * @author: Luo
 * @description:剑指 Offer 29. 顺时针打印矩阵
 * @time: 2020/6/5 9:17
 * Modified By:https://leetcode-cn.com/problems/shun-shi-zhen-da-yin-ju-zhen-lcof/
 */
public class t29 {
    public int[] spiralOrder(int[][] matrix) {
        int m = 0, n = 0;
        int a = matrix.length - 1,b = matrix[0].length - 1;
        int[] res = new int[(a+1)*(b+1)];
        int num = 0;
        while (true) {
            for (int i = n; i <= b; i++) {
                res[num++] = matrix[m][i];
            }
            if (++m > a) break;
            for (int i = m; i <= a; i++) {
                res[num++] = matrix[i][b];
            }
            if (--b < n) break;
            for (int i = b; i >= n; i--) {
                res[num++] = matrix[a][i];
            }
            if (--a < m) break;
            for (int i = a; i >= m; i--) {
                res[num++] = matrix[i][n];
            }
            if (++n > b) break;
        }
        return res;
    }
    public static void main(String[] args) {
        t29 t29 = new t29();
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(t29.spiralOrder(nums));
    }
}
