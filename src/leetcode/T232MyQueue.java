package leetcode;

import java.util.Stack;

/**
 * @author: Luo
 * @description:232. 用栈实现队列
 * @time: 2020/12/30 20:41
 * Modified By:https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class T232MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    /** Initialize your data structure here. */
    public T232MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack2.isEmpty())
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
       return stack2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (stack2.isEmpty())
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
