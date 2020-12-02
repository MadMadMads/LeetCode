package leetcode.offer;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author: Luo
 * @description:剑指 Offer 30. 包含min函数的栈
 * @time: 2020/12/2 13:49
 * Modified By:https://leetcode-cn.com/problems/bao-han-minhan-shu-de-zhan-lcof/
 */
public class t30 {
    /** initialize your data structure here. */
    Stack<Integer> min_stack;
    Stack<Integer> stack;
    public t30() {
        min_stack = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (!min_stack.isEmpty() && min_stack.peek() >= x)
            min_stack.push(x);
        if (min_stack.isEmpty())
            min_stack.push(x);
    }

    public void pop() {
       int x = stack.pop();
       if (x == min_stack.peek()) {
           min_stack.pop();
       }
    }

    public int top() {
       return stack.peek();
    }

    public int min() {
        return min_stack.peek();
    }
}
