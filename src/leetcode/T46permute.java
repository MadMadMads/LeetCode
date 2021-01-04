package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: Luo
 * @description:46. 全排列
 * @time: 2021/1/4 22:09
 * Modified By:https://leetcode-cn.com/problems/permutations/
 */
public class T46permute {
    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        fun1(nums,list,used);
        return res;
    }
    public void fun1(int[] nums,ArrayList<Integer> path,boolean[] used) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] == false) {
                path.add(nums[i]);
                used[i] = true;
                fun1(nums,path,used);
                path.remove(path.size() - 1);
                used[i] = false;
            }
        }
    }
}
