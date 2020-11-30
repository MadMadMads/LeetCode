package leetcode.competition;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: Luo
 * @description:修改数组
 * @time: 2020/10/10 16:33
 * Modified By:第十届蓝桥杯（研究生组）
 */
public class ModifyArray {
    public void modifyArray(int[] nums,int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            while (set.contains(nums[i])) {
                nums[i]++; }
            set.add(nums[i]);
        } }

    public static void main(String[] args) {
        ModifyArray modifyArray = new ModifyArray();
        modifyArray.modifyArray(new int[]{2,1,1,3,4},5);

    }
}
