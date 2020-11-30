package leetcode.offer;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author: Luo
 * @description:剑指 Offer 59 - II. 队列的最大值
 * @time: 2020/6/1 21:29
 * Modified By:https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/
 */
public class MaxQueue {
    Deque<Integer> deque = new LinkedList<>();
    Deque<Integer> maxDeque = new LinkedList<>();
    public MaxQueue() {

    }

    public int max_value() {
        return maxDeque.size()>0?maxDeque.getFirst():-1;
    }

    public void push_back(int value) {
        deque.addLast(value);
        while (!maxDeque.isEmpty() && maxDeque.getLast() < value)
            maxDeque.pollLast();
        maxDeque.addLast(value);
    }

    public int pop_front() {
        int temp = deque.size() > 0 ? deque.getFirst() : -1;
        if (!maxDeque.isEmpty() && maxDeque.getFirst().equals(temp)) {
            maxDeque.pollFirst();
        }
        return temp;
    }

}
