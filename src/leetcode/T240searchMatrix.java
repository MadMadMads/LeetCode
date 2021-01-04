package leetcode;

/**
 * @author: Luo
 * @description:240. 搜索二维矩阵 II
 * @time: 2021/1/4 22:41
 * Modified By:https://leetcode-cn.com/problems/search-a-2d-matrix-ii/
 */
public class T240searchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1,col = 0;
        while (row >=0 && col <matrix[0].length) {
            if (target == matrix[row][col]) return true;
            else if (target < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }
        return false;
    }
}
