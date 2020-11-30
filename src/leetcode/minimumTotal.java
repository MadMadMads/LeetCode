package leetcode;

import java.util.List;

/**
 * @author: Luo
 * @description:120. 三角形最小路径和
 * @time: 2020/9/27 16:50
 * Modified By:https://leetcode-cn.com/problems/triangle/
 */
public class minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] res = new int[triangle.size()][triangle.get(0).size()];
        res[0][0] = triangle.get(0).get(0);
        for (int i =1;i < triangle.size(); i++) {
            res[i][0] = res[i-1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i;i++) {
                res[i][j] = Math.min(res[i-1][j], res[i-1][j]) + triangle.get(i).get(j);
            }
            res[i][i] = triangle.get(i).get(i) + res[i-1][i-1];
        }
        int minTotal = res[triangle.size() - 1][0];
        for (int i = 1; i < triangle.size(); ++i) {
            minTotal = Math.min(minTotal, res[triangle.size() - 1][i]);
        }
        return minTotal;
    }
}
