package leetcode.offer.dynamic_programming;

import java.lang.annotation.ElementType;

/**
 * @author: Luo
 * @description:礼物的最大价值
 * @time: 2020/6/16 12:49
 * Modified By:https://leetcode-cn.com/problems/li-wu-de-zui-da-jie-zhi-lcof/
 */
public class t47 {
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] dp = new int[row + 1][col + 1];
        dp[1][1] = grid[0][0];
        int res = 0;
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col;j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]) + grid[i-1][j-1];
                res= Math.max(res,dp[i][j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,3,1}, {1,5,1}, {4,2,1}};
        t47 t47 = new t47();
        System.out.println(t47.maxValue(nums));
    }
}
