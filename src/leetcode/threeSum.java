package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:三数之和 二刷2020年6月12日
 * 三刷2021年02月20日
 * @time: 2020/4/29 21:34
 * Modified By:https://leetcode-cn.com/problems/3sum/
 */
public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
       /* Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i- 1])  continue;
            int L = i +1, R = nums.length - 1;
            while (L < R) {
                int sum = nums[L] + nums[R] + nums[i];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    while (L < R && nums[L + 1] == nums[L]) L++;
                    while (L < R && nums[R - 1] == nums[R]) R--;
                    L++;R--;
                } else if (sum < 0) L++;
                else {R--;}
            }
        }*/
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int a = i + 1, b = nums.length - 1;
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (a < b) {
                int sum = nums[i] + nums[a] + nums[b];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[a], nums[b]));
                    while (a < b && nums[a] == nums[a + 1]) a++;
                    while (a < b && nums[b] == nums[b - 1]) b--;
                    a++; b--;
                } else if(sum > 0) {
                    b--;
                } else {
                    a++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
