package leetcode;

/**
 * @author: Luo
 * @description:64. 最小路径和
 * @time: 2020/9/19 10:40
 * Modified By:https://leetcode-cn.com/problems/minimum-path-sum/
 */
public class minPathSum {
    public int minPathSum(int[][] grid) {
        int row = grid.length,col = grid[0].length;
        int[][] dp = new int[row][col];
        for (int i = 0; i < row; i++) {
            if (i == 0) {
                dp[0][0] = grid[0][0];
                continue;
            }
            dp[i][0] = grid[i][0] + dp[i -1][0];
        }
        for (int j = 1; j < col; j++) {
            dp[0][j] = dp[0][j - 1] + grid[0][j];
        }
        for (int i = 1 ; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(dp[i -1][j],dp[i][ j - 1]) + grid[i][j];
            }
        }
        return dp[row -1][col -1];
    }

    public static void main(String[] args) {
        minPathSum minPathSum = new minPathSum();
        int[][] res = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum.minPathSum(res));
    }
}
