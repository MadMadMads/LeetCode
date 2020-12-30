package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: Luo
 * @description:225. 用队列实现栈
 * @time: 2020/12/30 20:46
 * Modified By:https://leetcode-cn.com/problems/implement-stack-using-queues/
 */
public class T225MyStack {
    private Queue<Integer> queue;
    /** Initialize your data structure here. */
    public T225MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        for (int i = 1; i < queue.size();i++) {
            queue.add(queue.remove());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
       return queue.isEmpty();
    }
}
