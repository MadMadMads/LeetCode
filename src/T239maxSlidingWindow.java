import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: Luo
 * @description:239. 滑动窗口最大值
 * @time: 2020/12/20 16:28
 * Modified By:https://leetcode-cn.com/problems/sliding-window-maximum/
 */
public class T239maxSlidingWindow {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[]{};
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
        }
        res[0] = nums[deque.getFirst()];
        int index = 1;
        for (int i = k; i < nums.length; i++) {
            if (deque.getFirst() == i - k) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && nums[deque.getLast()] < nums[i]) {
                deque.pollLast();
            }
            deque.addLast(i);
            res[index++] = nums[deque.getFirst()];
        }
        return res;
    }
}

