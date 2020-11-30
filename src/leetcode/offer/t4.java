package leetcode.offer;

import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

/**
 * @author: Luo
 * @description:剑指 Offer 04. 二维数组中的查找
 * @time: 2020/6/26 16:51
 * Modified By:https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/
 */
public class t4 {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length; j++) {
               if (matrix[i][j] > target) break;
               if (matrix[i][j] == target) return true;
           }
       }
        return false;
    }
}
