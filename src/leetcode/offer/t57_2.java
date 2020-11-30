package leetcode.offer;

import java.util.ArrayList;

/**
 * @author: Luo
 * @description:剑指 Offer 57 - II. 和为s的连续正数序列
 * @time: 2020/11/22 22:24
 * Modified By:https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 */
public class t57_2 {
    public static int[][] findContinuousSequence(int target) {
        ArrayList<int[]> res = new ArrayList<>();
        int i = 1,j = 1;
        int sum = 0;
        while (i <= target / 2) {
            if (sum < target) {
                sum +=j;
                j++;
            } else if (sum > target) {
                sum -=i;
                i++;
            } else {
                int arr[] = new int[j - i];
                for (int k = i; k < j; k++) {
                    arr[k - i] = k;
                }
                res.add(arr);
                sum -=i;
                i++;
            }

        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        int[][] res = findContinuousSequence(9);
        System.out.println();
    }
}
