package leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: Luo
 * @description:剑指 Offer 59 - I. 滑动窗口的最大值
 * @time: 2020年8月19日23:29:56
 * Modified By:https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 *
 * 单调双向队列的运用
 */
public class t59 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums.length == 0 || k == 0) return new int[0];
        int[] res = new int[nums.length - k + 1];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!list.isEmpty() && list.getLast() < nums[i]) {
                list.pollLast();
            }
            list.addLast(nums[i]);
        }
        res[0] = list.peekFirst();
        for (int i = k; i < nums.length; i++) {
            if(list.peekFirst() == nums[i - k])
                list.removeFirst();
            while (!list.isEmpty() && list.getLast() < nums[i]) {
                list.pollLast();
            }
            list.addLast(nums[i]);
            res[i - k + 1] = list.peekFirst();
        }
        return res;
    }
    public static void main(String[] args) {
    }
}
