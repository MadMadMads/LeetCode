package leetcode;

import java.util.Stack;

/**
 * @author: Luo
 * @description:
 * @time: 2020/5/21 19:05
 * Modified By:
 */
public class MinStack {

    Stack stack = null;
    int min=Integer.MIN_VALUE;
    /** initialize your data structure here. */
    public MinStack() {
        stack = new Stack();
    }

    public void push(int x) {
        min = min<x?min:x;
        stack.push(x);
    }

    public void pop() {
        if(min == (int)stack.pop()) {
            min= (int) stack.pop();
        }
    }

    public int top() {
        return (int)stack.peek();
    }

    public int getMin() {
        return min;
    }
}

/**
 * Your leetcode.MinStack object will be instantiated and called as such:
 * leetcode.MinStack obj = new leetcode.MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
