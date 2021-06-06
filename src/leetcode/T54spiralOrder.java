package leetcode;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:54. 螺旋矩阵
 * @time: 2021/1/3 19:07
 * Modified By:https://leetcode-cn.com/problems/spiral-matrix/
 */
public class T54spiralOrder {
/*
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        if (matrix.length == 0) return list;
        int m = matrix.length,n = matrix[0].length;
        int count = (Math.min(m, n) + 1) / 2;
        int i = 0;
        while (i < count) {
            for (int j = i; j < n - i;j++) list.add(matrix[i][j]);
            for (int j = i + 1; j < m - i; j++) list.add(matrix[j][n - 1 - i]);
            for (int j = n - 2 - i; j >= i && m - 1 - i != i; j--) list.add(matrix[m - 1 - i][j]);
            for (int j = m - 2 - i; j > i && n - 1 - i != i ;j--) list.add(matrix[j][i]);
            i++;
        }
        return list;
    }
*/
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) return list;
        int m = matrix.length,n = matrix[0].length;
        int count = (Math.min(m,n) - 1) / 2;    //代表着层数，从0开始
        int i = 0;
        while (i <= count) {
            for (int j = i;j < n - i;j++) list.add(matrix[i][j]);
            for (int j = i + 1;j < m - i; j++) list.add(matrix[j][n - 1 -i]);
            for (int j = n - 2 - i; j > i&& (m-1-i != i) ; j--) list.add(matrix[m - 1 - i][j]);
            for (int j = m - 1 - i; j > i&& (n-1-i) != i; j--) list.add(matrix[j][i]);
            i++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] list = new int[][]{{3},{2}};
        T54spiralOrder t54spiralOrder = new T54spiralOrder();
        System.out.println(t54spiralOrder.spiralOrder(list).toString());
    }

}
