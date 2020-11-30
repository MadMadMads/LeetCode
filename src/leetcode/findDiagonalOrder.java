package leetcode;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @author: Luo
 * @description:498. 对角线遍历
 * @time: 2020/10/29 16:19
 * Modified By:https://leetcode-cn.com/problems/diagonal-traverse/
 */
public class findDiagonalOrder {
    public int[] findDiagonalOrder(int[][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        int m = matrix.length,n = matrix[0].length;
        int i = 0;
        while (i < m + n) {
            int x1 = i < m ? i : m - 1;
            int y1 = i - x1;
            while (x1 >= 0 && y1 < n) {
                res.add(matrix[x1][y1]);
                x1--;
                y1++;
            }
            i++;
            int y2 = i < n ? i : n - 1;
            int x2 = i - y2;
            while (y2 >= 0 && x2 < m) {
                res.add(matrix[x2][y2]);
                x2++;
                y2--;
            }
            i++;
        }
        return  res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
