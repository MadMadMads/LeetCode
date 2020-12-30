package leetcode;

import java.util.HashMap;

/**
 * @author: Luo
 * @description:1. 两数之和
 * @time: 2020/12/30 21:24
 * Modified By:https://leetcode-cn.com/problems/two-sum/
 */
public class T1twoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if (hashMap.containsKey(n) && hashMap.get(n) != i) {
                return new int[]{i,hashMap.get(n)};
            }
        }
        return new int[0];
    }
}
