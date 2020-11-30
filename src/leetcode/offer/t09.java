package leetcode.offer;

import java.util.LinkedList;

/**
 * @author: Luo
 * @description:剑指 Offer 09. 用两个栈实现队列
 * @time: 2020/7/1 16:18
 * Modified By:https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 */
public class t09 {

    LinkedList<Integer> A, B;
    public t09() {
        A = new LinkedList<Integer>();
        B = new LinkedList<Integer>();
    }
    public void appendTail(int value) {
        A.addLast(value);
    }
    public int deleteHead() {
        if(!B.isEmpty()) return B.removeLast();
        if(A.isEmpty()) return -1;
        while(!A.isEmpty())
            B.addLast(A.removeLast());
        return B.removeLast();
    }

}
