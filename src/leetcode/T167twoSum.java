package leetcode;

/**
 * @author: Luo
 * @description:167. 两数之和 II - 输入有序数组
 * @time: 2020/12/20 15:45
 * Modified By:https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class T167twoSum {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0,j = numbers.length - 1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum < target) {
                i++;
            } else if (sum > target) {
                j--;
            } else {
                return new int[]{i + 1,j + 1};
            }
        }
        return new int[]{};
    }
}
