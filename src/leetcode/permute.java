package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:46. 全排列
 * @time: 2020/10/16 15:14
 * Modified By:https://leetcode-cn.com/problems/permutations/
 */
public class permute {
    List<List<Integer>> res;
    public void dfs(int[] nums, LinkedList<Integer> list) {
        if (list.size() == nums.length) {
            res.add(new LinkedList<>(list));
        }
        for (int j = 0; j < nums.length; j++) {
            if (list.contains(nums[j])) continue;
            list.add(nums[j]);
            dfs(nums,list);
            list.removeLast();
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        dfs(nums,new LinkedList<>());
        return res;
    }

    public static void main(String[] args) {
        int[] ints = {1,2,3};
        permute p = new permute();
        p.permute(ints);
    }
}
