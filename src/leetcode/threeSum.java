package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:三数之和
 * 二刷2020年6月12日
 * @time: 2020/4/29 21:34
 * Modified By:https://leetcode-cn.com/problems/3sum/
 */
public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) break;
            int j = i + 1,m = len - 1;
            if (i > 0 && nums[i-1] == nums[i]) continue;
            while (j < m) {
                int sum = nums[i] + nums[j] + nums[m];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i],nums[j],nums[m]));
                    while (nums[j] == nums[j+1] && j < m) j++;
                    while (nums[m] == nums[m-1] && j < m) m--;
                    j++;m--;
                } else if (sum > 0) m--;
                else j++;

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
